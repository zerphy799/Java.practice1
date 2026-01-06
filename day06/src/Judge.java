import java.util.Arrays;

public class Judge {
    public static void main(String[]  args) {
    int[] x={1,5,4,2,5,20};
    int b=1;
    int[] newx = Arrays.copyOf(x, x.length);
    Arrays.sort(newx);
    if(Arrays.equals(x,newx)){
        System.out.println("有序");
    }else{
        System.out.println("无序");
    }
    for(int i=0;i<x.length;i++){
        if(x[i]>=x[i+1]){
            System.out.println("这个函数无序");
            b=0;
            break;
        }

    }
    if(b==1){
        System.out.println("这个函数有序");
    }

    }
}
