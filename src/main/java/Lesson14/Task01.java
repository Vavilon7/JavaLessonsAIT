package Lesson14;

import Lesson11.Person;

import java.util.Arrays;

public class Task01 {
    private static double[] balances = {-1000.50, 2000.75, -300.40, 5400.00, 12300.30};

    static Person personMax = new Person();
    static Person personMaria = new Person();

    private static Person[]persons = new Person[1000];



    public static void main(String[] args) {
        persons[0] = personMax;
        persons[1] = personMaria;

        //Напишите код для расчета среднего баланса по всем счетам
        double sum = 0;
        for (int i = 0; i < balances.length; i++) {
            sum = balances[i] + sum;
        }
        double avegage = sum / balances.length;
        System.out.println("avegage : " + avegage);

        //Определение количества счетов с балансом выше заданного значения 5000
        int counter = 0;
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] > 5000) {
                counter++;
            }
        }
        System.out.println("количества счетов с " +
                "балансом выше заданного значения 5000 = " + counter);


        /*
       Если счета могут иметь отрицательный баланс,
       подсчитайте общую сумму долга по всем счетам.
     */
        double sumNegativ = 0;
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] < 0) {
                sumNegativ = balances[i] + sumNegativ;
            }
        }
        System.out.println("sumNegativ: " + sumNegativ);


        /*
        Предположим, что некоторые счета ушли в минус.
        Замените все отрицательные балансы на ноль.
         */
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] < 0) {
                balances[i] = 0;
            }
            System.out.println(balances[i]);
        }
        System.out.println(Arrays.toString(balances));

        balances = new double[25];
        System.out.println(Arrays.toString(balances));
    }
}
