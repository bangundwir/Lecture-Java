package level2;

public class Soulution13 {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double moonWeight;
        moonWeight = earthWeight * 0.17;
        return moonWeight;
    }
}
