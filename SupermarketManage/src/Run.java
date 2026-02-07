import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Run {
    public static void main(String[] args) {
        String accout,password;
        int sum=0;//日志计数
        boolean bool=false;//判断是否登录成功
        System.out.println("欢迎使用超市管理系统");
        System.out.println("----------------------");
        System.out.println("请输入管理员账户和密码");
        Scanner sc = new Scanner(System.in);
        while (true) {
            accout=sc.nextLine();
            if (accout.equals("0")) {
                break;
            }
            password=sc.nextLine();
            ResourceBundle rb = ResourceBundle.getBundle("db");
            if(accout.equals(rb.getString("account"))&&password.equals(rb.getString("password"))){
                System.out.println("登录成功");
                bool=true;
                break;
            }
            else{
                System.out.println("登陆失败，请重新输入账户密码,或按0退出");
            }
        }
        if(bool){
            Cashier.createCashiers();
            Product.createProduct();
            Type.createTypes();
            Order.createOrders();
            Thread inventory=new Thread(()-> {
                while (true) {
                    System.out.println("-------系统实时更新当前库存商品数量和价格---------");
                    List<Product> products = Product.getProducts();
                    Double collect = products.stream().collect(Collectors.averagingDouble(Product::getPrice1));
                    Integer collect1 = products.stream().mapToInt(Product::getCount).sum();
                    DecimalFormat df = new DecimalFormat("0.00");
                    System.out.println("商品总数为" + collect1 + "件商品的平均价格为" + df.format(collect)+"￥");
                    try {
                        TimeUnit.MINUTES.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            Thread sales=new Thread(()-> {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
               while (true) {
                   List<Order> orders = Order.getOrders();
                   Double aver = orders.stream().collect(Collectors.averagingDouble((Order) -> Order.getTotalPrice().doubleValue()));
                   Integer collect = orders.stream().mapToInt((Order) -> {
                       Map<String, Integer> product = Order.getProduct();
                       Collection<Integer> values = product.values();
                       return values.stream().mapToInt(Integer::intValue).sum();
                   }).sum();
                   DecimalFormat df = new DecimalFormat("0.00");
                   System.out.println("当前出库的商品总数为"+collect+"个,平均价格为"+df.format(aver)+"￥");
                   try {
                       TimeUnit.MINUTES.sleep(1);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
            });
            inventory.start();
            sales.start();
            while(true) {
                int choose;
                System.out.println("------------系统管理-----------");
                System.out.println("1:收银员管理");
                System.out.println("2:日志管理");
                System.out.println("3:商品管理");
                System.out.println("4:商品分类管理");
                System.out.println("5:收银管理");
                System.out.println("0:关闭系统");
                choose=sc.nextInt();
                switch (choose) {
                    case 1:while (true) {
                        int choose1;
                        System.out.println("-----------收银员管理系统----------");
                        System.out.println("1:收银员列表");
                        System.out.println("2:新增收银员");
                        System.out.println("3:移除收银员");
                        System.out.println("4:返回上一级");
                        String[] title={"添加收银员","查看所有收银员","删除收银员"};
                        choose1=sc.nextInt();
                        switch (choose1) {
                            case 1:
                                System.out.println("----------收银员列表----------");
                                System.out.println("ID   账号      密码       年龄      性别     姓名      地址                   联系方式");
                                List<Cashier> cashiers = Cashier.getCashiers();
                                for (Cashier cashier : cashiers) {
                                    System.out.println(cashier);
                                }
                                sum++;
                                Log.add(Integer.toString(sum),choose,true,title[choose1-1],"查看了所有的收银员信息");
                                break;
                            case 2:
                                System.out.println("请输入想要添加的收银员的信息");
                             //   sc.nextLine();
                                String id=sc.next();
                                String account=sc.next();
                                String passWord=sc.next();
                                String gender=sc.next();
                                sc.nextLine();
                                String age=sc.next();
                                String name=sc.next();
                                String address=sc.next();
                                String phone=sc.next();
                                boolean b1 = Cashier.setCashier(account, address, age, gender, id, name, passWord, phone);//判断是否操作成功用于日志记录

                                sum++;
                                Log.add(Integer.toString(sum),choose,b1,title[choose1-1],"添加了一个收银员"+id);
                                break;
                            case 3:
                                System.out.println("请输入要删除的收银员的id");
                                String id1=sc.next();
                                boolean b = Cashier.deleteCashier(id1);
                                sum++;
                                Log.add(Integer.toString(sum),choose,b,title[choose1-1],"删除了一个id为"+id1+"的收银员");
                                break;
                        }if(choose1==4) break;
                    }break;
                    case 2:
                        List<Log> logs = Log.getLogs();
                        for (Log log : logs) {
                            System.out.println(log);
                        }break;
                    case 3:while(true) {
                        int choose3;
                        System.out.println("-----------商品管理模块------------");
                        System.out.println("1:商品列表");
                        System.out.println("2:新增商品");
                        System.out.println("3:移除商品");
                        System.out.println("4:修改商品");
                        System.out.println("5:商品入库");
                        System.out.println("6:商品出库");
                        System.out.println("7:返回上级");
                        choose3=sc.nextInt();
                        String[] title={"查看商品列表","添加商品","移除商品","修改商品","商品入库","商品出库"};
                        switch (choose3) {
                            case 1:
                                System.out.println("-------------------商品列表-------------------");
                                System.out.println("编号     名称       价格     数量        所属类别");
                                List<Product> products = Product.getProducts();
                                for (Product product : products) {
                                    System.out.println(product);
                                }
                                sum++;
                                Log.add(Integer.toString(sum),choose-1,true,title[choose3-1],"查看了所有商品的信息");//log设置的有固定长度为3的数组为了不超长还能匹配，因此减1
                                break;
                            case 2:
                                System.out.println("请输入新增商品的信息");
                                String id=sc.next();
                                String name=sc.next();
                                String idType=sc.next();
                                int count=sc.nextInt();
                                BigDecimal price=new BigDecimal(sc.next());
                                boolean b = Product.addProduct(count, id, name, price, idType);
                                sum++;
                                Log.add(Integer.toString(sum),choose-1,b,title[choose3-1],"新增id为"+id+"的商品信息");
                              break;
                              case 3:
                                System.out.println("请输入想要删除的产品的id");
                                String id1=sc.next();
                                  boolean b1 = Product.deleteProduct(id1);
                                  sum++;
                                  Log.add(Integer.toString(sum),choose-1,b1,title[choose3-1],"删除了id为"+id1+"的商品信息");
                                break;
                            case 4:
                                System.out.println("请输入要更改的产品id和更改后的价格");
                                String id2=sc.next();
                                BigDecimal price1=new BigDecimal(sc.next());
                                if(Integer.parseInt(String.valueOf(price1))<0){
                                    System.out.println("不能设置为小于0的价格");
                                    break;
                                }
                                boolean b2 = Product.changeProduct(id2, price1);
                                sum++;
                                Log.add(Integer.toString(sum),choose-1,b2,title[choose3-1],"更改了id为"+id2+"的商品信息");
                                break;
                            case 5:
                                System.out.println("请输入需要入库的商品的ID");
                                String id3=sc.next();
                                boolean b3 = Product.increaseCount(id3);
                                sum++;
                                Log.add(Integer.toString(sum),choose-1,b3,title[choose3-1],"入库了id为"+id3+"的商品");
                                break;
                            case 6:
                                System.out.println("请输入需要出库的商品的ID");
                                String id4=sc.next();
                                boolean b4 = Product.decreaseCount(id4);
                                sum++;
                                Log.add(Integer.toString(sum),choose-1,b4,title[choose3-1],"出库了id为"+id4+"的商品");
                                break;
                        }if(choose3==7) break;
                    }break;
                case  4:while(true) {
                    int choose4;
                    System.out.println("--------商品类型管理模块----------");
                    System.out.println("1:类型列表");
                    System.out.println("2:新增类型");
                    System.out.println("3:删除类型");
                    System.out.println("4:返回上级");
                    choose4=sc.nextInt();
                    switch (choose4) {
                        case 1:
                            System.out.println("ID      名称");
                            List<Type> types = Type.getTypes();
                            for (Type type : types) {
                                System.out.println(type);
                            }
                            sum++;
                            Log.add(Integer.toString(sum),choose-2,true,"查看列表类型","查看了所有的列表类型");
                            break;
                        case 2:
                            System.out.println("请输入你想添加的类型和编号");
                            String name=sc.next();
                            String idType=sc.next();
                            boolean b = Type.addType(idType, name);
                            sum++;
                            Log.add(Integer.toString(sum),choose-2,b,"新增类型","新增id为"+idType+"的类型");
                            break;
                        case 3:
                            System.out.println("请输入你想删除的类型的编号");
                            String id1=sc.next();
                            boolean b1 = Type.removeType(id1);
                            sum++;
                            Log.add(Integer.toString(sum),choose-2,b1,"删除类型","删除了id为"+id1+"的类型");
                            break;
                    }if(choose4==4) break;
                }
                    case 5: boolean b=false,j=false;//b判断是否登录成功,j用来打断循环退出
                        while(true) {
                        System.out.println("---------欢迎使用收银管理系统---------");
                        System.out.println("\n请输入您的账号密码");
                        String account=sc.next();
                        String password1=sc.next();
                        List<Cashier> cashiers = Cashier.getCashiers();
                        for (Cashier cashier : cashiers) {
                            if(account.equals("0")){
                                j=true;
                                break;
                            }
                            if(cashier.getPassword().equals(password1)&&cashier.getAccount().equals(account)) {
                                sum++;
                                Log.add(Integer.toString(sum),choose-3,true,"收银员登录","id为"+cashier.getId()+"的收银员登陆");
                                System.out.println("登录成功");
                                b=true;
                                break;
                            }
                        }
                        if(j){ break;}//打断循环
                            System.out.println("登录失败，请重新输入,按0返回上级");
                    }if(b){

                        while (true) {
                           int choose5;
                            System.out.println("-------收银模块---------");
                            System.out.println("1:新增订单");
                            System.out.println("2:订单列表");
                            System.out.println("3:查找订单");
                            System.out.println("4:返回上一级");
                           choose5=sc.nextInt();
                           switch (choose5) {
                               case 1:
                                   System.out.println("请输入新添加的订单的信息");
                                   String id1=sc.next();
                                   String cashierId=sc.next();
                                   int count=sc.nextInt();
                                   String name=sc.next();
                                   int price = Product.getPrice(name);
                                   if(price==0){
                                       System.out.println("产品不存在,创建失败");
                                       sum++;
                                       Log.add(Integer.toString(sum),choose-3,false,"新增订单","新增了id为"+id1+"的订单");
                                       break;
                                   }
                                   BigDecimal price1=new BigDecimal(price*count);
                                   HashMap<String, Integer> map = new HashMap<>();
                                   map.put(name,count);
                                   boolean b1 = Order.addOrder(cashierId, id1, map, price1);
                                   sum++;
                                   Log.add(Integer.toString(sum),choose-3,b1,"新增订单","新增了id为"+id1+"的订单");
                                   break;
                               case 2:
                                   List<Order> orders = Order.getOrders();
                                   System.out.println("订单编号  收银员编号  产品名  数量   总价    日期");
                                   for (Order order : orders) {
                                       System.out.println(order);
                                   }
                                   sum++;
                                   Log.add(Integer.toString(sum),choose-3,true,"查看订单","查看了所有的订单");
                                   break;
                               case 3:
                                   System.out.println("请输入要查找的订单编号");
                                   String id2=sc.next();
                                   boolean b2 = Order.findOrder(id2);
                                   sum++;
                                   Log.add(Integer.toString(sum),choose-3,b2,"查找订单","查找了ID为"+id2+"的订单");
                                   break;
                           }if(choose5==4) break;
                        }
                        }else break;
                }if(choose==0)break;

            }
        }else{
            System.out.println("系统关闭");
        }
    }
}
