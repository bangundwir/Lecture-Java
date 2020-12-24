package level2;

public class level2reference1 {
// And here's why.
// This code is analogous to the code on the left
    public static void main (String[] args)
  {
    int m = 5;
    int n = 6;

    System.out.println("M=" + m + " N=" + n);
    int a = m, b = n;

    int c = a;
    a = b;
    b = c;

    System.out.println("M=" + m + " N=" + n);
  }
}
