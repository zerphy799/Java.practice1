import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {
    private static final long serialVersionUID = -7165969855354670664L;
    private String name;
    private String gender;
    private int age;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
       out.writeUTF(name);
        out.writeUTF(gender);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException {
        name = in.readUTF();
        gender = in.readUTF();

    }

    public Student() {
    }

    public Student(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
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
}
