import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int i = scan.nextInt();
        if (i % 10 == 7){
            System.out.println("Ваше число заканчивается на 7");
        }
        else {
            System.out.println("Ваше число не заканчивается на 7");
        }
    }
}