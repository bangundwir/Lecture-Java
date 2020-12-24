package level2;

public class coba1 {
    public static int min(int a, int b, int c, int d) {
        // write your code here
        if (((a <= b) && (a <= c) && (a <= d)))
            return a;
        else if (((b <= a) && (b <= c) && (b <= d)))
            return b;
        else if (((c <= a) && (c <= b) && (c <= d)))
            return c;
        else
            return d;

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
    

