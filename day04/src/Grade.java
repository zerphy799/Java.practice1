import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int grade, core;
        Scanner scanner = new Scanner(System.in);
        grade = scanner.nextInt();
        core = grade / 10;
        switch (core) {
            case 0, 1, 2, 3, 4, 5:
                System.out.println("E");
                break;
            case 6:
                System.out.println("D");
                break;
            case 7:
                System.out.println("C");
                break;
            case 8:
                System.out.println("B");
                break;
            case 9,10:
                System.out.println("A");
                break;
        }
    }
}
