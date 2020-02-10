package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ExampleTest {
    Book book1 = new Book("TestName", "Bob Doe", 1990);
    Book book2 = new Book("Animal Book", "John Dave", 1994);
    ArrayList<Book> Library = new ArrayList<Book>(){
        {
            add(book1);
            add(book2);
        }
    };

    @Test
    public void testBookNamePrint() {
        assertEquals(book1.getBookName(),"TestName");
        assertEquals(book2.getBookName(),"Animal Book");
    }
    @Test
    public void testBookAuthorPrint(){
        assertEquals(book1.getAuthor(), "Bob Doe");
        assertEquals(book2.getAuthor(), "John Dave");
    }
    @Test
    public void testBookDatePrint(){
        assertEquals(book1.getYearPublished(), 1990);
        assertEquals(book2.getYearPublished(), 1994);
    }

    @Test
    public void testBookPrintAllInfo(){
        assertEquals(book1.printBookInfo(), "TestName" + "\t" + "Bob Doe" + "\t" + 1990);
        assertEquals(book2.printBookInfo(), "Animal Book" + "\t" + "John Dave" + "\t" + 1994);
    }
    @Test
    public void testCorrectOptionChosen(){

    }
}
