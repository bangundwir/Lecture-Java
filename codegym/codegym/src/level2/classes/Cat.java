package level2.classes;
//class
public class Cat {

    String name;
    int age;

    static int count = 0;
    public static void main(String[] args){
        Cat smudge = new Cat();
        smudge.age = 3;
        smudge.name = "smudge";
        count++;

        Cat flutty = new Cat();
        flutty.age = 5;
        flutty.name = " flutty";
        count++;
 
        System.out.println("We created a cat named " + smudge.name + ". His age is " + smudge.age);
        System.out.println("We created a cat named " + flutty.name + ". His age is " + flutty.age);

        System.out.println("Total number of cats = " + count++);
    }
    
}
