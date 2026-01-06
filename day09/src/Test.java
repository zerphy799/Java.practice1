public class Test {
    public static void main(String[] args) {

     Car card = new Car();
        Car[] cars = card.getCars();
        int num=0;
        for(Car car : cars){
            System.out.println(car.getBland());
            System.out.println(car.getCapacity());
           num=Revenue.money(car);
           num+=num;
        }
        System.out.println("总计"+num+"元");
    }
}
