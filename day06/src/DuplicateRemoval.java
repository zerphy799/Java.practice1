import java.util.Arrays;

public class DuplicateRemoval {
    public static void main() {

        int x[]={1,2,3,4,2,1,3,5,6,9,5};
        Arrays.sort(x);
        for(int a=1;a<x.length;a++){
            if(x[a-1]==x[a]){
                x[a-1]=0;
            }
        }
        int b=0;
        int[] z=new int[7];
        for(int a=0;a<x.length;a++){
            if(x[a]!=0){
                z[b]=x[a];
                b++;
            }
        }
        for(int c:z){
            System.out.print(c+"\t" );
        }
    }

}
