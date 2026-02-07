import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private String id;
    private String name;
    private BigDecimal price;
    private int count;
    private String typeId;
    public static List<Product> products = new ArrayList<>();
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }
    public static int getPrice(String name) {
       for (Product p : products) {
           if (p.getName().equals(name)) {
               return p.getPrice().intValue();
           }
       }
        return 0;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public Product(int count, String id, String name, BigDecimal price, String typeId) {
        this.count = count;
        this.id = id;
        this.name = name;
        this.price = price;
        this.typeId = typeId;
    }
    public static boolean addProduct(int count, String id, String name, BigDecimal price, String typeId){
        for (Product product1 : products) {
            if (product1.getId().equals(id)||product1.getName().equals(name)) {
                product1.setCount(product1.getCount()+count);
                System.out.println("商品重复,已添加数量");
                return false;
            }
        }
        Product product = new Product(count, id, name, price, typeId);
        products.add(product);
        System.out.println("添加成功");
        return true;
    }

    public static List<Product> getProducts() {
        return products;
    }
    public static boolean deleteProduct(String id) {
        for (Product product1 : products) {
            if (product1.getId().equals(id)) {
                products.remove(product1);
                System.out.println("删除成功");
                return true;
            }
        }
        System.out.println("未能找到，请重新确认id");
        return false;
    }
    public static boolean increaseCount(String id) {
        int count;
        Scanner sc = new Scanner(System.in);
        for (Product product1 : products) {
            if (product1.getId().equals(id)) {
                System.out.println("请输入要入库的数量");
                count = sc.nextInt();
                product1.setCount(product1.getCount()+count);
                System.out.println("入库成功");
                return true;
            }
        }
        System.out.println("商品不存在");
        return false;
    }
    public static boolean decreaseCount(String id) {
        int count;
        Scanner sc = new Scanner(System.in);
        for (Product product1 : products) {
            if (product1.getId().equals(id)) {
                System.out.println("请输入要出库的数量");
                count = sc.nextInt();
                if(product1.getCount()<count){
                    System.out.println("出库失败，产品尽剩"+product1.getCount());
                    return false;
                }
                product1.setCount(product1.getCount()-count);
                System.out.println("出库成功");
                return true;
            }
        }
        System.out.println("商品不存在");
        return false;
    }
    public static  List<Product> createProduct() {
        products.add(new Product(35,"1","面包",new BigDecimal("9.9"),"1"));
        products.add(new Product(51,"2","洗发水",new BigDecimal("69.9"),"2"));
        products.add(new Product(12,"3","笔记本",new BigDecimal("5"),"3"));
        products.add(new Product(32,"4","香蕉",new BigDecimal("4.2"),"4"));
        products.add(new Product(44,"5","牛奶",new BigDecimal("8"),"5"));
        products.add(new Product(2,"6","鼠标",new BigDecimal("99"),"6"));
        return products;
    }

    @Override
    public String toString() {
        return id + "   " +
                "    " + name +
                "        " + price +
                "￥     " + count +
                "个        " + Type.getName(typeId);
    }
    public  static boolean changeProduct(String id,BigDecimal price) {
        for (Product product1 : products) {
            if (product1.getId().equals(id)) {
                product1.setPrice(price);
                return true;
            }
        }
        System.out.println("ID错误");
        return false;
    }

   public double getPrice1(){
        return  price.doubleValue();
   }
}
