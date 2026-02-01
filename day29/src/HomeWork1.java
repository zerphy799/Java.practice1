import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ResourceBundle;

public class HomeWork1 {
    public static void main(String[] args) throws IOException {
        ResourceBundle rb = ResourceBundle.getBundle("config");
        String className = rb.getString("class.name");
        String property= rb.getString("property.names");
        String type= rb.getString("property.types");
        String  packageName=className.substring(0,className.lastIndexOf("."));
        className = className.substring(className.lastIndexOf(".")+1);
        StringBuilder cn = new StringBuilder("package "+packageName+";");
        cn.append("\n").append("public class ").append(className).append(" {");
        cn.append("\n");
        String[] types = type.split(",");
        String[] properties = property.split(",");
        for (int i = 0; i < properties.length; i++) {
            cn.append("private  ").append(types[i]).append("  ");
            cn.append(properties[i]).append(";").append("\n");
        }
        cn.append("public ").append(className).append("(");
        for (int i = 0; i < properties.length; i++) {
            cn.append(types[i]).append(" ").append(properties[i]).append(",");
        }
        cn.deleteCharAt(cn.lastIndexOf(","));
        cn.append("){").append("\n").append("      }");
        cn.append("\n").append("public  ").append(className).append("()").append("{").append("\n").append("   }");
        for (int i = 0; i < properties.length; i++) {
            cn.append("\n").append("public void set").append(properties[i]).append("(").append(types[i]).append(" ").append(properties[i]).append("){").append("\n").append("this.").append(properties[i]).append("=").append(properties[i]).append(";").append("\n").append(" }");
            cn.append("\n").append("public ").append(types[i]).append(" get").append(properties[i]).append("()").append("{").append("\n").append("return ").append(properties[i]).append(";").append("\n").append(" }");
        }
        cn.append("\n").append("public String toString(){").append("\n").append("return ");
         cn.append("\"Student{\" +");
        for (int i = 0; i < properties.length; i++) {
            cn.append("\n").append(" \" ").append(properties[i]).append("='").append("\"").append(" + ").append(properties[i]).append(" + '\\'' +");
        }
        cn.append("\n").append("'}';");
        cn.append("\n").append("    }").append("\n").append("}");
        String base="C:/Users/ljh/IdeaProjects/untitled/day29/src/";
        String replace = packageName.replace('.', '/');
        base+=replace;
        className +=".java";
         File f=new File(base);
         f.mkdirs();
        FileWriter fw=new FileWriter(new File(f,className));
        fw.write(String.valueOf(cn));
        fw.close();
    }
}
