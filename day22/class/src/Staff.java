import java.util.Objects;

public class Staff implements Comparable<Staff>{
    private String name;
    private Integer age;
    private Integer sal;

    public Staff(Integer age, String name, Integer sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return Objects.equals(name, staff.name) && Objects.equals(age, staff.age) && Objects.equals(sal, staff.sal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sal);
    }

    @Override
    public int compareTo(Staff o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}

