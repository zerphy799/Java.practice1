import java.io.*;

public class TestObjectOutputStream {
    public static void main(String[] args) {

    }
    public static void t1() throws IOException {
        Student student =new Student("北京",25,"男","李白");
        FileOutputStream fileOutputStream =new  FileOutputStream("D/aa");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
            objectOutputStream.close();
    }
    public static void t2() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream =new  FileInputStream("D/aa");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student =(Student) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(student);

    }
}
