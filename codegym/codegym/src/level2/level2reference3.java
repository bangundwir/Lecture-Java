package level2;

public class level2reference3 {
    public static void main(String[] args) {
        Student jen = new Student();
        jen.name = "Jen";
        jen.age = 21;

        Student beth = new Student();
        beth.name = "Beth";
        beth.age = 15;

        System.out.println("Jen is " + jen.age);
        System.out.println("Beth is " + beth.age);

        Student a = jen, b = beth;

        int c = a.age;
        a.age = b.age;
        b.age = c;

        System.out.println("Jen is " + jen.age);
        System.out.println("Beth is " + beth.age);
    }

    static class Student {
        String name;
        int age;
    }
}
