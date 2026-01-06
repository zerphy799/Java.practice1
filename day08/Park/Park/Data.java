public class Data {
private String type;
private int exitTime;

    public int getExitTime() {
        return exitTime;
    }

    public void setExitTime(int exitTime) {
        this.exitTime = exitTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String tyre) {
        this.type = tyre;
    }
    public void judge(){
        if(type.equals("小型车")){
            if(exitTime<1){
                System.out.println("收费8元");
            }
            else{
                System.out.println("收费"+((exitTime-1)*5+8)+"元");
            }
        }
        else{
            if(exitTime<1){
                System.out.println("收费15元");
            }
            else{
                System.out.println("收费"+((exitTime-1)*8+15)+"元");
            }
        }
    }
}
