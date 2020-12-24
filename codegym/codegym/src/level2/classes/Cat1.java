package level2.classes;
//class variable
public class Cat1 {

    String name;
    int age;

    static int count = 0;

    public static void main(String[] args) {
        Cat1 smudge = new Cat1();
        smudge.age = 12;
        smudge.name = "smudge";
        count++;

        System.out.println("We created a cat name " + smudge.name + ". His age is " + smudge.age);

        System.out.println("Total number of cats = " + count);
    }
    
}
