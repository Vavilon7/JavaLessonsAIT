package Lesson16;

public class Consultation {
    public static void main(String[] args) {
        //тип_данных[] имя_массива
        //создали массив цен типа double размер 5
        double[] prices = new double[5];

        //создали массив возрастов сотрудников и заполнили его значениями
        int[]age = {20, 34, 19, 50, 44};

        //сохраняем цену 20.5... в массиве на позиции 0 (индекс 0)
        prices[0]= 20.5;
        prices[1]= 40.5;
        prices[2]= 12.99;
        prices[3]= 4.0;
        prices[4]= 50;

        //выводим на экран первый элемент массива
        System.out.println(prices[0]);
        double secondElement = prices[1];
        System.out.println(secondElement);

        //получаем размер массива
        int length = prices.length;
        System.out.println(length);


        //вывод всех элементов массива на экран
        System.out.println("-------for---------");
        for (int i = 0; i < prices.length; i++ ){
            System.out.println(prices[i]);
        }

        System.out.println("-------for-2--------");
        for (double price: prices){
            System.out.println(price);
        }

        double[]newPrices = new double[30];
        //копируем данные из prices в newPrices
        //System.arraycopy(массив откуда копируем, стартовый индекс для копирования,
        // в какой массив копируем, стартовый индекс для копирования в массиве куда копируем,
        // количество элементов);
        System.arraycopy(prices,0,newPrices,0,prices.length);
        System.out.println("-------newPrices--------");
        for (double newprice: newPrices){
            System.out.println(newprice);
        }

        //клонирование массива
        double [] clonePrices = prices.clone();
        System.out.println("-------clonePrices--------");
        for (double cloneprice: clonePrices){
            System.out.println(cloneprice);
        }

        /*
        Представьте, что у вас есть массив `ratings`, содержащий рейтинги нескольких фильмов от 1 до 5.
         Напишите программу на Java, которая вычислит средний рейтинг всех фильмов в массиве.
         */
        System.out.println("-------ratings--------");
        int[]ratings = new int [5];
        ratings[0]= 2;
        ratings[1]= 6;
        ratings[2]= 3;
        ratings[3]= 1;
        ratings[4]= 5;

        int sum =0;
        for(int rating: ratings){
            sum = sum + rating;
        }
        int averageRating = sum/ratings.length;
        System.out.println(averageRating);
    }
}


