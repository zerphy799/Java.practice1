public class Car {
    private double capacity;
    private String bland;
    private Car[] cars;

    public Car(String bland, double capacity) {
        this.bland = bland;
        this.capacity = capacity;
    }

    public Car() {
        this.cars = new Car[3];
        cars[0] = new Car("奥迪", 3.2);
        cars[1] = new Car("迈腾", 2.8);
        cars[2] = new Car("宝来", 1.6);

    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getBland() {
        return bland;
    }
}
