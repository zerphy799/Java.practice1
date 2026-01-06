import java.util.Scanner;

public class PhoneBasic {
    private String color;
    private String brand;
    private String model;
    private int wight;


    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void Message(){
        String message;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要发送的信息");
        message = input.nextLine();
        System.out.println("成功发送");
        System.out.println(message);

    }
    public void Calling(){
        String number;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入电话号");
        number = input.nextLine();
        System.out.println("正在给"+number+"打电话");
    }

}

