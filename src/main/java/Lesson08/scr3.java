package Lesson08;

import java.util.Scanner;

public class scr3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = 1;
         int res =1;
         for (int i=2; i<= n; i++){
             res *=i;
         }
        System.out.println(res);
    }
}
