package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca! Your one-stop-shop for great book titles in Bangalore!");
        ArrayList<Book> Library = populateBooks();
        Menu(Library);
    }

    private static void printAvailableBooks(ArrayList<Book> library) {
        for(Book book: library){
            System.out.println(book.printBookInfo());
        }
    }

    private static void Menu(ArrayList<Book> Library) {
        System.out.println("Please select an option:");
        System.out.println("1: Show list of available books");
        Scanner userInput = new Scanner(System.in);
        int option = Integer.parseInt(userInput.nextLine());
        switch(option) {
            case 1:
                printAvailableBooks(Library);
                break;
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
