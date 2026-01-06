public class Test {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("李白");
        student.setAge(15);
        Manager manager=new Manager();
        manager.judge(student);
    }
}
