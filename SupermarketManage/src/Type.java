import java.util.ArrayList;
import java.util.List;

public class Type {
    private String id;
    private String name;
    public static List<Type> types=new ArrayList<>();
    public Type(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNames() {
        return name;
    }

    public static String getName(String id) {
        for (Type type : types) {
       if( type.getId().equals(id)){
           return type.getNames();
       }
        }
        return "不存在该类";
    }

    public void setName(String name) {
        this.name = name;
    }
    public static boolean addType(String id ,String name){
        for (Type type : types) {
            if(type.getId().equals(id)){
                System.out.println("已有这个编号");
                return false;
            }
            if(type.getNames().equals(name)){
                System.out.println("类名重复");
                return false;
            }
        }
        Type type=new Type(id,name);
        types.add(type);
        return true;
    }
    public static boolean removeType(String id){
        for (Type type : types) {
            if(type.getId().equals(id)){
                types.remove(type);
                System.out.println("删除成功");
                return true;
            }
        }
        System.out.println("没有找到对应ID");
          return false;
    }
    public  static List<Type> getTypes() {
        return types;
    }
    public static void createTypes(){
        types.add(new Type("1","食品类"));
        types.add(new Type("2","日用品类"));
        types.add(new Type("3","文具类"));
        types.add(new Type("4","水果类"));
        types.add(new Type("5","饮品类"));
        types.add(new Type("6","数码类"));
    }

    @Override
    public String toString() {
        return  id + "      " + name;
    }
}
