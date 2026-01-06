public class Factary {
   static String gender;
    public static God person(String g) {
    gender = g;
    if(gender.equals("women")){
        return new Women();
    }
    else if(gender.equals("man")){
        return new Man();
    }
    else{
        return null;
    }
    }


}
