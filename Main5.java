public class Main5 {
    public static void main(String[] args) {
        String str = "?, wo#rld — программа, рез#ультатом #работы которой явл#яется вывод на экран или иное устройс#тво фр#азы ?, world";
        System.out.println(str.replace("?", "Hello").replace("#", ""));
    }
}