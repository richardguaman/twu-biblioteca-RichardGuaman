package com.twu.biblioteca;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void willCheckOutBook () throws Exception {
        BibliotecaApp app = new BibliotecaApp();
        app.populateBooks();
        assertEquals(3,app.getAvailableBooks().size());
        app.removeBookFromLibrary("Biology");
        assertEquals(2,app.getAvailableBooks().size());
    }

    @Test
    public void willThrowErrorifBookUnavailable() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Sorry that book is not available.");
        BibliotecaApp app = new BibliotecaApp();
        app.populateBooks();
        app.removeBookFromLibrary("Biology");
        app.removeBookFromLibrary("Biology");
    }
}
