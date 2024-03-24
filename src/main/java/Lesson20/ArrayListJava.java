package Lesson20;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListJava {
    public static void main(String[] args) {
        //создание arrayList
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> listIdteger = new ArrayList<>();
        //добавление элементов
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        //сохранение на определенный индекс, на определенную позицию
        list.add(0,"Kiwi");

        //Итерация элементов в листе
        for (String element: list){
            System.out.println(element);
        }
        for(int i=0; i<list.size(); i++){
            System.out.println(i + " " + list.get(i));
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

        //Преобразование листа в массив
        String[] array = list.toArray(new String[0]);

        //Удаление элемента
        list.remove("Banana");
        list.remove("Cherry");
        //Удаление элемента по индексу
        //list.remove(0);

        //размер листа (количество элементов)
        int listSize = list.size();
        System.out.println(listSize);

        //Замена элемента в листе в указанной позиции
        list.set(1,"Mango");

        //Получение элемента из листа на указанной позиции
        String element = list.get(0);
        System.out.println(element);

        //Удаление всех элементов в листе
        list.clear();

        System.out.println(list.size());


    }
}
