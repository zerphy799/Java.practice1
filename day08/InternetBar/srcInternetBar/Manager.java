public class Manager {
    public void judge(Student student){
       int a= student.getAge();
       if(a>18){
           System.out.println(student.getName()+"可以上网");
       }
       else{
           System.out.println(student.getName()+"不可以上网");
       }
    }
}
