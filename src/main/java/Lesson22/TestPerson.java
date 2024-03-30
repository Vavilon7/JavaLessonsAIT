package Lesson22;

import java.util.HashSet;

public class TestPerson {
    public static void main(String[] args) {
        HashSet<Person> personHashSet = new HashSet<>();
        Person terminator = new Person("Terminator", 25);
        Person bond = new Person("James Bond", 30);
        Person bondClone = new Person("James Bond", 31);

        //добавляем героев в HashSet
        personHashSet.add(terminator);
        personHashSet.add(bond);
        personHashSet.add(bondClone);


        System.out.println(personHashSet);


    }
}


