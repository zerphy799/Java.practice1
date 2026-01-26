import java.util.Date;

public class Lottery {
    private String type;
    private Integer value;
    private String time;
    private String number;
    private String number2;

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Lottery{" +
                "time='" + time + '\'' +
                ", serial Number=" + number +
                ", lottery Number=" + number2 +
                '}';
    }

    public Lottery(String type, Integer value) {
        this.type = type;
        this.value = value;
         Date date = new Date();
         setTime(date.toString());
         StringBuffer str1=new StringBuffer ();
         StringBuffer str2=new StringBuffer ();
         str1.append((int)( Math.random()*100000));
         str2.append((int)( Math.random()*100000));
         str1.append(str2);
         setNumber(str1.toString());
         String str3= String.valueOf((int) (Math.random() * 100000));
         setNumber2(str3);
    }


}
