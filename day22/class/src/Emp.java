public class Emp {
private String name;
private int age;
private int sal;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Emp(int age, String name, int sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
