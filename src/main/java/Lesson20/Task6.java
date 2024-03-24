package Lesson20;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
       /* Создайте ArrayList с именем "names" и добавьте в него следующие имена: "Alice", "Bob", "Charlie", "David".
                Выведите на экран содержимое списка "names" с использованием цикла for-each.
                Добавьте новое имя "Eva" в конец списка "names".
                Вставьте имя "Frank" на позицию с индексом 2 в списке "names".
                Удалите имя "David" из списка.
        Проверьте, существует ли имя "Charlie" в списке "names", и выведите соответствующее сообщение.
                Очистите список "names" от всех элементов.*/
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        for(String name:names){
            System.out.println(name);
        }
        names.add("Eva");
        names.add(2,"Frank");
        names.remove("David");
        System.out.println(names);
        boolean isName=false;
        for(int i=0;i<names.size();i++){
            if(names.get(i).equals("Charlie")){
                System.out.println("Имя Charlie есть в списке, оно находится под индексом " + i);
                isName=true;
            }
        }
        if(!isName){
            System.out.println("Имени Charlie нет в списке!");
        }
        names.clear();

    }
}
