package Lesson13;

import java.util.Arrays;

public class TaskArray {
    public static void main(String[] args) {
        /*
         Напишите метод, который принимает
          массив целых чисел и
          возвращает минимальное
           значение из этого массива.
         */
        int[] salaryMaria = new int[7];
        salaryMaria[0] = 350;
        salaryMaria[1] = 200;
        salaryMaria[2] = 450;
        salaryMaria[3] = 470;
        salaryMaria[4] = 400;
        salaryMaria[5] = 490;
        salaryMaria[6] = 250;

        int minSalaryMaria = getMinSalary(salaryMaria);
         System.out.println(minSalaryMaria);
         System.out.println(checkElementsInArray(salaryMaria));
        int[] firstArray = {1, 2, 3, 4};
        int[] secontArray = {6, 7, 8};
        sumArraysNew(firstArray, secontArray);
    }
// вывод минимальной зарплаты
    public static int getMinSalary(int[] salary) {
        int minSalary = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if (salary[i] < minSalary) {
                minSalary = salary[i];
            }
        }
        return minSalary;
    }

    public static boolean checkElementsInArray(int[] elements) {
        //1,2,3,5,6,3,7,8
        for (int i = 0; i < elements.length - 1; i++) {
            if (elements[i + 1] < elements[i]) {
                return false;
            }
        }
        return true;
    }

    /*
    Реализуйте метод, который принимает два массива целых чисел,
    и объединяет в один отсортированный массив.

    1,2,3,4 -arrayOne->
    6,7,8 --arrayTwo->
    <-sumArray- 1,2,3,4,6,7,8
     */
    public static int[] sumArrays(int[] arrayOne,
                                  int[] arrayTwo) {
        int[] sumArray = new int[arrayOne.length + arrayTwo.length];
        for (int i = 0; i < arrayOne.length; i++) {
            sumArray[i] = arrayOne[i];
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            sumArray[i + arrayOne.length] = arrayTwo[i];
        }
        return sumArray;
    }

    public static int[] sumArraysNew(int[] arrayOne,
                                     int[] arrayTwo) {
        int[] sumArray = new int[arrayOne.length + arrayTwo.length];
        System.arraycopy(arrayOne, 0, sumArray, 0, arrayOne.length);
        System.arraycopy(arrayTwo, 0, sumArray, arrayOne.length, arrayTwo.length);
        Arrays.sort(sumArray);
        return sumArray;

    }


}


