package level2.classes;

public class Cat4 {

    String name;
    int age;

    // Constructor for the Cat class
    public Cat4(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public static void main(String[] args) {
        Cat4 smudge = new Cat4("Smudge", 5); // The default constructor is invoked here
        System.out.println(smudge.name);
        System.out.println(smudge.age);
    }
}
