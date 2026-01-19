import java.util.ResourceBundle;

public class c {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("user");
         String username = rb.getString("user");
         String password = rb.getString("passport");
        System.out.println("Username: " + username+ " Password: " + password);
    }

}
