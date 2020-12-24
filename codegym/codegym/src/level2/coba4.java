package level2;

public class coba4 {
    public static int min(int a, int b, int c) {
        // write your code here
        int minimum = a;

        if (a > b) {
            minimum = b;
        }
        if (minimum > c) {
            minimum = c;
        }
        return minimum;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }   
}
