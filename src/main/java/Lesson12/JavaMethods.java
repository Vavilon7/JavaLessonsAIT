package Lesson12;

public class JavaMethods {
    public static void main(String[] args) {
        printGreeting();
        printGreetingStudent("Anna");
        printGreetingStudent("Anna", 42.2);
        boolean checkResult = checkStudent("Anna");
        System.out.println(checkResult);
        //checkGroupNumber(234);
        int factorial = getFactorial(5);
        System.out.println(factorial);
    }

    public static void printGreeting() {
        System.out.println("Hallo Berlin!!!");
    }

    public static void printGreetingStudent(String studentName) {
        System.out.println("Hallo " + studentName);
    }

    public static void printGreetingStudent(String studentName, double groupNumber) {
        System.out.println("Hallo " + studentName + " your group " + groupNumber);
    }

    public static boolean checkStudent(String studentName) {
        if (studentName.equals("Anna")) {
            return true;
        } else {
            return false;
        }
        //return  studentName.equals("Anna");
    }

    public static boolean checkGroupNumber(double groupNumber) {
        System.out.println(groupNumber);
        if (groupNumber == 123) {
            return true;
        } else
            return false;
    }

    //название; findUserByName
    //количество параметров: 3-4 >5--> рефакторинг
    //простота метода
    //комментарии
    //валидация входящих параметров

    //расчет факториала
    public static int getFactorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * getFactorial((number - 1));
        }
    }
}


