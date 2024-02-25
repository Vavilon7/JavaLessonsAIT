package Lesson12;

public class HomWork {
    /*Напишите программу на Java, которая демонстрирует работу с методами. Ваша программа должна включать
     метод calculateArea, который принимает в качестве аргументов значения типа double: длину и ширину прямоугольника,
      и возвращает значение его площади. Также должен быть реализован метод calculatePerimeter, принимающий те же аргументы
      и возвращающий периметр прямоугольника. Главный метод (main) должен считывать значения длины и ширины, переданные пользователем,
    вызывать оба эти метода для расчета площади и периметра, и выводить результаты расчетов на экран.
     */
    public static void main(String[] args) {
        double length= 20.55;
        double width= 30.77;

        double сalculeteArea=(length + width);
        System.out.println( " Площадь прямоугольника " + "= " + сalculeteArea );
        double calculatePerimeter = 2 * (length + width);
        System.out.println( " Периметр прямоугольника " + "= " + calculatePerimeter );
    }
}






