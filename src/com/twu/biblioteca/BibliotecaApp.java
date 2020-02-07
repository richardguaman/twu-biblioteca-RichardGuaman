package com.twu.biblioteca;


import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca! Your one-stop-shop for great book titles in Bangalore!");
        ArrayList<Book> Library = populateBooks();
        for(Book book:Library){
            System.out.println(book.getBookName());
        }
    }

    private static ArrayList<Book> populateBooks() {
        final Book scienceBook = new Book("Biology");
        final Book computerBook = new Book("Computer Design");
        final Book animalBook = new Book("All About Animals");
        return new ArrayList<Book>(){
            {
                add(scienceBook);
                add(computerBook);
                add(animalBook);
            }
        };
    }
}
