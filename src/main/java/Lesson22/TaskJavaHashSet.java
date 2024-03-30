package Lesson22;
import java.util.Arrays;
import java.util.HashSet;

public class TaskJavaHashSet {

    public static void main(String[] args) {
        /*
         **Задача**: Дан `HashSet` со строками: "Java", "Python", "C",
         * "JavaScript". Проверьте, содержит ли набор строку "Python",
         * и если да, удалите её. Выведите итоговое содержимое `HashSet` на экран.
         */
        HashSet<String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("JavaScript");

        if (languages.contains("Python")) {
            languages.remove("Python");
        }

        System.out.println(languages);

        /*
         **Задача**: Используя `HashSet`
         * из предыдущего упражнения (без строки "Python"),
         * итерируйте по нему и выведите каждый элемент в верхнем регистре.
         */
        for (String language : languages) {
            System.out.println(language.toUpperCase());
        }

        /*
        2 HashSet: Найдите объединение,
        пересечение и разность этих множеств.
        Выведите результаты на экран.
         */
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        //объединение
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("union--> " + union);

        //пересечение
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection--> " + intersection);

        //разность
        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("difference--> " + difference);

        //Проверка подмножества
        HashSet<Integer> set3 = new HashSet<>(Arrays.asList(1, 2, 3 ));
        HashSet<Integer> set4 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        if(set4.containsAll(set3)){
            System.out.println("Set3 является подмножеством set4");
        }
        else {
            System.out.println("Set3 не является подмножеством set4");
        }


    }
}

