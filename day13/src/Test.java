public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("丢失老虎故克隆一个");
        Tiger tiger = new Tiger();
        Tiger cloneTiger=(Tiger) tiger.clone();
          if(tiger.equals(cloneTiger)){
              System.out.println("克隆成功");
          }else{
              System.out.println("克隆失败");
          }
    }
}
