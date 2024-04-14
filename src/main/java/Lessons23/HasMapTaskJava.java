package Lessons23;

import java.util.HashMap;
import java.util.Map;

public class HasMapTaskJava {public static void main(String[] args) {
        /*
        Создайте HashMap studentGrades, который будет хранить имена студентов
        (тип String) и их оценки (тип Integer).
        Добавьте в HashMap данные трех студентов:
        Иван (оценка 5), Светлана (оценка 4) и Алексей (оценка 3).
         */
    HashMap<String, Integer> studentGrades = new HashMap<>();
    studentGrades.put("Иван", 5);
    studentGrades.put("Светлана",4);
    studentGrades.put("Алексей", 3);

        /*
        Используя HashMap из предыдущего упражнения,
        получите и напечатайте оценку Светланы.
         */
    Integer svetlanaGrade = studentGrades.get("Светлана");
    System.out.println("Оценка Светланы: " + svetlanaGrade);

        /*
        Проверьте, содержится ли в вашем HashMap студент с именем Антон.
        Выведите соответствующее сообщение в зависимости от результата.
         */
    if (studentGrades.containsKey("Антон")) {
        System.out.println("Студент с именем Антон есть в HashMap.");
    } else {
        System.out.println("Студент с именем Антон нема в HashMap.");
    }

        /*
        Удалите из HashMap запись для студента Алексей.
        Выведите содержимое HashMap после удаления.
         */
    studentGrades.remove("Алексей");
    System.out.println(studentGrades);

        /*
        Напечатайте имена и оценки всех студентов из HashMap.
        Используйте для этого метод `entrySet()` и расширенный цикл `for`.
         */
    System.out.println("Имена и оценки всех студентов:");
    for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
        String name = entry.getKey();
        Integer grade = entry.getValue();
        System.out.println(name + ": " + grade);
    }
        /*
        Измените оценку Светланы на 5 в вашем HashMap.
        Проверьте, была ли оценка изменена, и выведите содержимое HashMap после изменения.
         */
    System.out.println(studentGrades);
    studentGrades.replace("Светлана", 5);
    System.out.println(studentGrades);

        /*
        Напечатайте имена всех студентов,
        у которых оценка равна 5, используя HashMap `studentGrades`.
         */
    System.out.println("Имена студентов с оценкой 5:");
    for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
        String name = entry.getKey();
        Integer grade = entry.getValue();
        if (grade == 5) {
            System.out.println(name);
        }
    }

        /*
        Очистите HashMap `studentGrades` от всех записей.
        Проверьте, пуст ли он после этого, и выведите соответствующее сообщение.
         */
    studentGrades.clear();
    //studentGrades.clear();
    if (studentGrades.isEmpty()) {
        System.out.println("HashMap studentGrades пуст после очистки.");
    } else {
        System.out.println("HashMap studentGrades не пуст после очистки.");
    }

    System.out.println("Romove");
    for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
        String name = entry.getKey();

        if (name.equals("Иван")) {
            studentGrades.remove("Иван");
        }
    }
    System.out.println();
}
}

