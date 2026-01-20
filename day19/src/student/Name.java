package student;

import java.util.ArrayList;
import java.util.List;

public class Name {
    private  String name;
   public static List<String> names = new ArrayList<>();
    public Name(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {}
    public static List<String> getNames() {
        names.add("李白");
        names.add("杜甫");
        names.add("白居易");
        names.add("李商隐");
        return names;
    }
}
