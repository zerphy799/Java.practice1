public class Student {
    private String name;
    private int age;
    private String gender;

    public Student(String name, int age, String gender) {
    }

    public Student() {
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setage(int age) {
        this.age = age;
    }

    public int getage() {
        return age;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getgender() {
        return gender;
    }

    public String toString() {
        return "Student{" +
                " name='" + name + '\'' +
                " age='" + age + '\'' +
                " gender='" + gender + '\'' +
                '}';
    }
}