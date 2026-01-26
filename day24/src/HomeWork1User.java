import java.io.Serializable;

public class HomeWork1User implements Serializable {
    private static final long serialVersionUID = 1726909543937855571L;
    private String name;
    private String password;

    public HomeWork1User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "HomeWork1User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
