package level2.classes;

public class contoh0 { 
        String name;
        int age;
    
    public static void main(String[] args) {
        contoh0 smudge = new contoh0();
        smudge.age = 3;
        smudge.name = "Smudge";

        System.out.println("We createn a cat named " + smudge.name + ". His age is " + smudge.age);
    }
}
