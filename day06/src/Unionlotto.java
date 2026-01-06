public class Unionlotto {
    public static void main() {
        int[] x = new int[7];
        int a = 0, b = 0, t = 0;
        for (int i = 0; i < 20; i++) {
            int circle = (int) (Math.random() * 32 + 1);
            if (circle >= 1 && circle <= 16 && a == 0) {
                x[t] = 0;
                a = 1;
                t++;
                if (t == 7) {
                    break;
                }
            }
            if (circle >= 1 && circle <= 33 && b != circle) {
                x[t] = 1;
                b = circle;
                t++;
                if (t == 7) {
                    break;
                }

            }
        }
        for (int c : x) {
            if (c == 1) {
                System.out.print("red  ");
            } else {
                System.out.print("blue  ");
            }
        }

    }
}
