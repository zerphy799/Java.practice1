public class Teacher {
    private String name;
    private String gender;
    private int age;
    public Teacher(String gender, String name) {
        this.gender = gender;
        this.name = name;
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
        return "Teacher{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Teacher() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
