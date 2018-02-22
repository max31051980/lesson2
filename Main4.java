import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        Random number = new Random();
        int i = 1 + number.nextInt(10001);
        int ten = i % 100 / 10;
        int one = i % 10;
        if (ten == 1)
            System.out.println(i + " рублей");
        else if (one == 1) System.out.println(i + " рубль");
        else if (one == 2 || one == 3 || one == 4) System.out.println(i + " рубля");
        else System.out.println(i + " рублей");
    }
}