package lesson03;

public class Calculator {
    static int numberOne = 100;

    static int numberTwo = 50;

    public static void main (String[] args) {
       System.out.println(addition(numberOne, numberTwo));
       System.out.println(multiplication(numberOne, numberTwo));
    }
    public static int addition (int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public static int multiplication (int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
}
