package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Book book1 = new Book("Winnetou", "Karol May", LocalDate.of(1990, 10, 10));
        Book book2 = new Book("Old Shatterhand", "Karol May", LocalDate.of(1995, 7, 10));
        Book book3 = new Book("Indianie i kowboje", "Alfred Szklarski", LocalDate.of(1999, 12, 5));
        Book book4 = new Book("Rio Bravo", "John Wayne", LocalDate.of(2001, 2, 1));

        Library westernLibrary = new Library("Western Books");
        westernLibrary.getBooks().add(book1);
        westernLibrary.getBooks().add(book2);
        westernLibrary.getBooks().add(book3);
        westernLibrary.getBooks().add(book4);

        //When
        System.out.println(westernLibrary.getBooks().toString());

        //Then



    }


}
