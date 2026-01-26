import java.io.*;

public class HomeWork2 {
    public static void main(String[] args) {
        File dir=new File("D:/aa");
        boolean mkdir = dir.mkdir();
        File file1=new File("D:/aa","hello.txt");
        try {
            boolean file1NewFile = file1.createNewFile();
            System.out.println(file1NewFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File file2=new File("D:/aa","World.txt");
        try {
            boolean file2NewFile = file2.createNewFile();
            System.out.println(file2NewFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File file3=new File("D:/bb");
       copyFolder(dir,file3);
        File[] files = file3.listFiles();
        for (File file : files) {
            String absolutePath = file.getAbsolutePath();
            System.out.println("absolutePath"+absolutePath);
        }
        file1.delete();
        file2.delete();
        file3.delete();
        dir.delete();
    }
    public static void copyFolder(File src, File dst) {
              dst.mkdir();
        if (src.isDirectory()) {
            File[] files = src.listFiles();
            for (File file : files) {
                File newfile = new File(dst, file.getName());
                try {
                    newfile.createNewFile();
                } catch (IOException e) {
                  e.printStackTrace();
                }
                if (!file.isDirectory()) {
                    try {
                        FileReader reader = new FileReader(file);
                        FileWriter writer = new FileWriter(newfile);
                        reader.transferTo(writer);
                        reader.close();
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                   copyFolder(file, newfile);
                }
            }
        }else{
            try {
                FileReader reader = new FileReader(src);
                FileWriter writer =new FileWriter(dst);
                reader.transferTo(writer);
                reader.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
        }
    }
}
