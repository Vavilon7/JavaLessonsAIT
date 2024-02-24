package Lesson11;

public class Calculator {
    private static String operation = "+";
    private static double numberOne = 10;
    private static double numberTwo = 30;
    public static void main(String[] args) {
        double result;

        switch (operation){
            case "+":
                result = sumNumbers(numberOne, numberTwo);
                break;
            default:
                System.out.println("Неправильная операция");
                result = 0;
        }

        System.out.println(result);
    }
    public static  double sumNumbers(double firstNumber, double secondNumber){
        double result = firstNumber + secondNumber;
        return  result;
    }
}
