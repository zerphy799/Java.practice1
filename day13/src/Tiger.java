import java.util.Objects;

public class Tiger implements Cloneable{
   private int wight=300;
  private   double length=1.5;

    public double getLength() {
        return length;
    }

    public int getWight() {
        return wight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null||this.getClass()!=obj.getClass()) return false;
      Tiger tiger = (Tiger) obj;
        return this.wight == tiger.wight && this.length == tiger.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wight,length);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
