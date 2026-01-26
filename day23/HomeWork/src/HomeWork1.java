import java.io.File;

public class HomeWork1 {
    public static void main(String[] args) {
        File[] disks=File.listRoots();
        for (File disk : disks) {
            File[] files = disk.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.lastModified()+'\t'+"    "+file.length());
                }else if (file.isDirectory()) {
                    System.out.println(file.lastModified()+'\t'+"<DIR>");
                }
            }
        }
    }
}
