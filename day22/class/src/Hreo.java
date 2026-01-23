public class Hreo {
    private String name;
    private Integer blood;

    public Integer getBlood() {
        return blood;
    }

    public void setBlood(Integer blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hreo(Integer blood, String name) {
        this.blood = blood;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hreo{" +
                "blood=" + blood +
                ", name='" + name + '\'' +
                '}';
    }
}
