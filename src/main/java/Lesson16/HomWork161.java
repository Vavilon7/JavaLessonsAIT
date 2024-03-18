package Lesson16;

public class HomWork161 {
    public static void main(String[] args) {
        statistics(10, 87, 5, 543);
    }

    public static void sum(int... numberN) {
        if (numberN.length == 0) {
            System.out.println("You did not enter a value! ");
        }
        else {
            int sum = 0;
            for (int i : numberN) {
                sum += i;
            }
            System.out.println("The sum of all numbers is: " + sum);
        }
    }

    public static void statistics(double... numberN) {
        if (numberN.length == 0) {
            System.out.println("You did not enter a value! ");
        }
        else {
            boolean foundNegativeNumber= false;
            //проверяем валидность данных
            for (double number : numberN) {
                if (number < 0) {
                    System.out.println("Error!!! You entered a negative value!");
                    foundNegativeNumber = true;
                    //при обнаружении негативного числа, выполнение цикла перкращается,
                    //дальнейшее выполнение программы прерывается
                }
            }
            //если числа все > 0
            if(!foundNegativeNumber){
                double numberMin = numberN[0];
                double minNumber = getMinValue(numberN);
                double numberMax = numberN[0];
                double numberAverage = 0;
                for (double number : numberN) {
                    if (number < numberMin) {
                        numberMin = number;
                    }
                    if (number > numberMax) {
                        numberMax = number;
                    }
                    numberAverage += number;
                }
                numberAverage = numberAverage / numberN.length;
                System.out.println("The minimum value is: " + numberMin);
                System.out.println("The minimumTwo value is: " + minNumber);
                System.out.println("The maximum value is: " + numberMax);
                System.out.println("The average value is: " + numberAverage);
            }
        }
    }

    public static double getMinValue(double... numbers){
        double minValue =  numbers[0];
        for (double number : numbers) {
            if(number < minValue){
                minValue = number;
            }
        }
        return  minValue;
    }
}

