package student;

public class Grade {

   private int yuwen;
   private int shuxue;
   private int yingyu;
   private int dili;

    public Grade(int dili, int shuxue, int yingyu, int yuwen) {
        this.dili = dili;
        this.shuxue = shuxue;
        this.yingyu = yingyu;
        this.yuwen = yuwen;
    }

    public int getDili() {
        return dili;
    }

    public void setDili(int dili) {
        this.dili = dili;
    }

    public int getShuxue() {
        return shuxue;
    }

    public void setShuxue(int shuxue) {
        this.shuxue = shuxue;
    }

    public int getYingyu() {
        return yingyu;
    }

    public void setYingyu(int yingyu) {
        this.yingyu = yingyu;
    }

    public int getYuwen() {
        return yuwen;
    }

    public void setYuwen(int yuwen) {
        this.yuwen = yuwen;
    }

    @Override
    public String toString() {
        return "语文=" + yuwen +
                ", 英语=" + yingyu +
                ", 数学=" + shuxue +
                ", 地理=" + dili
                ;
    }

}
