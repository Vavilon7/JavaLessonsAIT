package lesson04;

public class Task01 {
    /* Напишите ппрограмму, которая объявляет три переменные типа float
    и присваевает им значения. Программа должна вычислять и выводить среднее
    значение этих трех чисел.*/
public static void main (String[]args){
float numberOne = 100.12f;
float numberTwo = 300.45f;
float numberThree = 400.56f;

        float sum = numberOne+numberTwo+numberThree;
        System.out.println(sum);
        float result = sum /3;
        System.out.println(result);

        System.out.println( "----------Double------------");
    double numberOneDouble = 100.12;
    double numberTwoDouble = 300.45;
    double numberThreeDouble = 400.56;
    // считаем сумму трех чисел
    double sumDouble = numberOneDouble+numberThreeDouble+numberThreeDouble;
    System.out.println( sumDouble);
    double resultsumDouble = sumDouble/3;
    System.out.println(resultsumDouble);

}
}
