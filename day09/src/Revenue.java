public class Revenue {

    Revenue() {
    }

    public static int money(Car car) {
        double capacity = car.getCapacity();

        if (1 > capacity) {
            System.out.println("360元");
            return 360;
        } else if (capacity > 1 && capacity < 1.6) {
            System.out.println("420元");
            return 420;
        } else if (capacity > 1.6 && capacity < 2.0) {
            System.out.println("540元");
            return 540;
        } else if (capacity > 2.0 && capacity < 2.5) {
            System.out.println("800元");
            return 800;
        } else if (capacity > 2.5 && capacity < 3.0) {
            System.out.println("1800元");
            return 1800;
        } else if (capacity > 3.0 && capacity < 4.0) {
            System.out.println("2800元");
            return 2600;
        } else {
            System.out.println("3600元");
            return 3600;
        }
    }
}
