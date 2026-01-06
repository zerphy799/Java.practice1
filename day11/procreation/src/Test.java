public class Test {
    public static void main(String[] args) {
        God man=Factary.person("man");
        God women=Factary.person("women");
        man.eat();
        women.eat();
        man.say();
        women.say();
        man.sleep();
        women.sleep();
    }
}
