package level2;

public class coba3 {
    public static int min(int a, int b, int c, int d) {
        // write your code here
        int m4;
        int test1 = min(a, b);
        int test2 = min(c, d);

        if (test1 <= test2) {
            m4 = test1;
        }
        else{
            m4 = test2;
        }
        return m4;
    }

    public static int min(int a, int b) {
        // write your code here
        if (a < b)
            return a;
        else
            return b;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}
