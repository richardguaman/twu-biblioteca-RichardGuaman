package com.twu.biblioteca;


import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class ExampleTest {
    Book book1 = new Book("TestName");
    Book book2 = new Book("Animal Book");

    @Test
    public void testBookNameMethods() {
        assertEquals(book1.getBookName(),"TestName");
        assertEquals(book2.getBookName(),"Animal Book");
    }

}
