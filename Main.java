public class Main {
    public static void main(String[] args) {
        String str = "Строка в Java является объектом, поэтому ее можно создать, как и любой другой объект, при помощи оператора new";
        System.out.println("This string is contain " + str.length() + " signs");
        int half = str.length() / 2;
        System.out.println("First part of the string is - " + str.substring(0, half));
        System.out.println("Second part of the string is - " + str.substring(half));
    }
}