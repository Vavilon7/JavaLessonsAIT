package lesson03;

public class Variables {

    //-128 до 128 1 байт
    static byte age = 27;

    //-32768 до 32767
    static short preis = 10000;

    //-2147483648 до 2147483647 4 байта
    static int number = 500;

    //-9223372036854775808 до 9223372036854775807 8 байт
    static long bigNumber = 34343434343434L;

    //дробные числа, с плавающей точкой
    static float euroPreis = 0.85f;

    //дробные числа, с плавающей точкой
    static double dollarPreis = 0.855;

    //символы
    static char charLetter = 'A';

    //логические (да или нет)
    static boolean result = true;

    //текст
    static String text = "Hello";

public static void main(String[] args) {
    System.out.println("Возраст" + age);
    System.out.println("Курс валюты евро/доллар" + euroPreis);
    System.out.println(charLetter);
    System.out.println(text);
    System.out.println(result);
    System.out.println(dollarPreis/3);
    System.out.println(number*2);
}
}