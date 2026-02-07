import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    private String orderId;
    private String date;
    private String cashierId ;
    private BigDecimal totalPrice;
    private Map<String,Integer> product;
    public static List<Order> orders = new ArrayList<>();
    public String getCashierId() {
        return cashierId;
    }

    public void setCashierId(String cashierId) {
        this.cashierId = cashierId;
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd HH时mm分ss秒");
        this.date = formatter.format(dateTime);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Map<String, Integer> getProduct() {
        return product;
    }

    public void setProduct(Map<String, Integer> product) {
        this.product = product;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Order(String cashierId, String orderId, Map<String, Integer> product, BigDecimal totalPrice) {
        this.cashierId = cashierId;
        this.orderId = orderId;
        this.product = product;
        this.totalPrice = totalPrice;
        setDate();
    }

    public static boolean addOrder(String cashierId, String orderId, Map<String, Integer> product, BigDecimal totalPrice) {
        for (Order order : orders) {
            if ( order.orderId.equals(orderId)) {
                System.out.println("订单编号重复");
                return false;
            }
        }
        orders.add(new Order(orderId,cashierId,product,totalPrice));
        return true;
    }
    public static List<Order> getOrders() {
        return orders;
    }
    public static void createOrders(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("香蕉",20);
        orders.add(new Order("4", "001", map,new BigDecimal("78.8") ));
    }
    public  static boolean findOrder(String orderId){
        for (Order order : orders) {
            if(order.orderId.equals(orderId)){
                System.out.println(order);
                return true;
            }
        }
        System.out.println("ID不存在");
        return false;
    }
    public static boolean deleteOrder(String orderId){
        for (Order order : orders) {
            if(order.orderId.equals(orderId)){
                orders.remove(order);
                return true;
            }
        }
        System.out.println("ID不存在");
        return false;
    }

    @Override
    public String toString() {
        String str = product.toString();
        String s = str.substring(str.indexOf("{") + 1, str.indexOf("="));
        str = str.substring(str.indexOf("=") + 1, str.indexOf("}"));
        return  orderId  +
                "       " + cashierId  +
                "      " + s+"   " +str+
                "     " + totalPrice +
                "     " + date ;
    }
}
