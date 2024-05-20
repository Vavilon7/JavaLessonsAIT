package Lesson12;
import java.util.Scanner;
public class HonWork02 {


        public static String str2 = "";
        public static String str1 = "";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку: ");

            while (true) {
                if (scanner.hasNextInt()) {
                    System.out.println("Ошибка, введите строку");
                    scanner.nextLine();
                } else {
                    str1 = scanner.nextLine().replaceAll(" ", "");
                    break;
                }
            }

            reverseString(str1);
            isPalindrome(str1);
            System.out.println("Вы ввели строку (без пробелов): " + str1 + " и строку: " + str2);
            scanner.close();
        }

        public static String reverseString(String str1) {
            StringBuilder stringBuilder = new StringBuilder(str1);
            return  stringBuilder.reverse().toString();
        }

        public static boolean isPalindrome(String str1) {
            String revString = reverseString(str1);
            if (str1.equals(revString)) {
                System.out.println("Это палиндром!");
                return true;
            } else {
                System.out.println("Строки разные. Это не палиндром! ");
                return false;
            }
        }

        public static String reverseStringNew(String str){
            String reverseString = "";
            for(int i = (str.length()-1); i>=0;i--){
                reverseString += str.charAt(i);
            }
            return reverseString;
        }

        private static boolean isPalindromeNew(String word){

            if(word.length()==1 || word.isEmpty()){
                //Если метод дошел до этого шага, значит во всех
                // предыдущих шагах буквы друг другу равнялись и мы смело можем сказать что это true
                return true;//base step
            }
            //Если первый и последний символ строки ==, то тогда мы продолжаем вызывать
            //наш палиндром(тоесть еще есть шанс, что это будет палиндром
            if(word.charAt(0)==word.charAt(word.length()-1)){
                //первую и последнюю букву обрезаем и уменьшаем String с обеих строн убирая
                // по одной букве
                return isPalindromeNew(word.substring(1,word.length()-1));//recursive step
            }
            return false;
        }
    }


