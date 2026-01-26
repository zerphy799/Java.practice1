import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 8295822148991864818L;
    private String name;
    private int age;
    private String address;
    private transient String gender;   //加上transient可以避免被序列化。实现有选择的序列化


    public Student(String address, int age, String gender, String name) {
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
