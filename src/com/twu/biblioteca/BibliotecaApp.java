package com.twu.biblioteca;


import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca! Your one-stop-shop for great book titles in Bangalore!");
        ArrayList<Book> Library = populateBooks();
        for(Book book:Library){
            System.out.println(book.printBookInfo());
        }

    }

    private static ArrayList<Book> populateBooks() {
        final Book scienceBook = new Book("Biology", "John Doe", 1999);
        final Book computerBook = new Book("Computer Design","Dave Joe",1998);
        final Book animalBook = new Book("All About Animals", "Rick Sanchez", 2019);
        return new ArrayList<Book>(){
            {
                add(scienceBook);
                add(computerBook);
                add(animalBook);
            }
        };
    }
}
