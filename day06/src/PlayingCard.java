public class PlayingCard {
    public static void main() {
        int[][] x=new int[4][13];
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                x[i][j]=j+1;
            }
        }
        for(int i=0;i<4;i++){
            System.out.print("[");
            for(int j=0;j<13;j++){
                System.out.print(x[i][j]+"\t");
            }
            System.out.println("]");
        }

    }
}
