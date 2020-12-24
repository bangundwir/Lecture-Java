package level2;

public class Soulution15 {
    public static int min(int a, int b, int c, int d) {
        //
        int x = (min((min((min(a, b)), c)), d));
        // int x = (min((min((min(a, b)), c)), d));
        return x;
       
    }
    public static int min(int a, int b) {
        //
        if (a < b){
            return a;
        } 
        else {
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}
