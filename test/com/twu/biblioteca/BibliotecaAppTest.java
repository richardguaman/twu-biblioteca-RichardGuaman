package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
    @Test
    public void willCheckOutBook (){
        BibliotecaApp app = new BibliotecaApp();
        app.populateBooks();
        assertEquals(3,app.getAvailableBooks().size());
        app.removeBookFromLibrary(1);
        assertEquals(2,app.getAvailableBooks().size());
    }
}
