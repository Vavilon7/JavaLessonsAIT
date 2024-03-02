package Lesson12;
import java.util.Scanner;
public class HomWork01 {

    public class Task01 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("length --> ");
            double length = scanner.nextDouble();
            System.out.println("wight --> ");
            double wight = scanner.nextDouble();
            double area = calculateArea(length, wight);
            System.out.println("Area: " + area);
            double perimeter = calculatePerimeter(length, wight);
            System.out.println("Perimeter: " + perimeter);
            scanner.close();
        }

        public static double calculateArea(double lengthOfFigure, double wightOfFigure){
            if(lengthOfFigure <= 0 || wightOfFigure <=0){
                System.out.println("ERROR");
                return  -1;
            }
            return  lengthOfFigure * wightOfFigure;
        }

        public static  double calculatePerimeter(double length, double wight){
            if(length <= 0 || wight <=0){
                System.out.println("ERROR");
                return  -1;
            }
            return  2 * (length + wight);
        }


    }

}
