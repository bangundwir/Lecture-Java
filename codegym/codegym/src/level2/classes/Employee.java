package level2.classes;
//Abstraction
public class Employee {
    String name;
    int age;
    int SSN;
    int ID;
    
    public static void main(String[] args){
        Employee Hendra = new Employee();
        Hendra.name = "Hendra";
        Hendra.age = 21;
        Hendra.SSN = 2132414;
        Hendra.ID = 215213;

        System.out.println("nama : " + Hendra.name + "\nUmur : " + Hendra.age + "\nSSN : " + Hendra.SSN + "\nID : " + Hendra.ID);
    }
}
