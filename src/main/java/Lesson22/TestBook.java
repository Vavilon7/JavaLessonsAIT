package Lesson22;

import java.util.HashSet;

public class TestBook {
    public static void main(String[] args) {
        Book pilevinBook = new Book("KGBT+", "Pivevin");
        Book pilevinNewBook = new Book("KGBT", "Pivevin");
        Book bookHobbit = new Book("Hobbit", "Tolkien");

        HashSet<Book> bookHashSet = new HashSet<>();
        bookHashSet.add(pilevinBook);
        bookHashSet.add(bookHobbit);
        System.out.println(bookHashSet);

        System.out.println("------");
        bookHashSet.add(pilevinNewBook);
        System.out.println(bookHashSet);


    }
}

