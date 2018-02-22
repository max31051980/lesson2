import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 1 + random.nextInt(10);
        int b = 1 + random.nextInt(10);
        int r = 1 + random.nextInt(10);
        int d = r * 2;
        System.out.println("Сторона прямоугольника а = " + a);
        System.out.println("Сторона прямоугольника b = " + b);
        System.out.println("Радиус круга = " + r);
        if (d >= Math.sqrt(a * a + b * b))
            System.out.println("Круг закроет прямоугольник");
        else
            System.out.println("Круг не закроет прямоугольник");
    }
}