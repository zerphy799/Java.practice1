public class Triangle {
    public static void main(){
        int[][] z=new int[10][];
        z[0]=new int[1];
        z[0][0]=1;
        z[1]=new int[2];
        z[1][0]=1;
        z[1][1]=1;
        for(int j=2;j<10;j++){
            z[j]= new int[10];
            for(int k=0;k<j+1;k++){
                if(k==0||k==j){
                    z[j][k]=1;
                }else {
                    z[j][k] = z[j - 1][k - 1] + z[j - 1][k];
                }
                }
        }
        for(int j=0;j<10;j++){
            for(int k=0;k<j+1;k++){
                System.out.print(z[j][k]+"\t");
            }
            System.out.println();
        }
    }
}
