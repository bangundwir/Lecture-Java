package level2;

public class level2lesson3 {
    public static void main(String[] args) {
        Cat kitty = new Cat();
        Cat Kitty = new Cat();
        Cat smokey = null;
        smokey = kitty;
        kitty = null;
    }
    public static class Cat {

    }
    
}
