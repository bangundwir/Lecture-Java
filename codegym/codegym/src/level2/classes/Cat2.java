package level2.classes;
//Methods
public class Cat2 {
    
    String name;
    int age;

    public void sayMeow() {
        System.out.println("Meow");
    }

    public void jump() {
        System.out.println("Pounce!");
    }

    public static void main(String[] args) {
        Cat2 smudge = new Cat2();
        smudge.name = "smudge";
        smudge.age = 12;

        smudge.sayMeow();
        smudge.jump();
    }
    
}
