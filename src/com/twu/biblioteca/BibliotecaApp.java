package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    ArrayList<Book> library = new ArrayList<Book>();

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca! Your one-stop-shop for great book titles in Bangalore!");
        BibliotecaApp app = new BibliotecaApp();
        app.populateBooks();
        app.menu();
    }

    private void printAvailableBooks() {
        int bookIndex = 1;
        for (Book book : getAvailableBooks()) {
            System.out.println(bookIndex + ". " + book.printBookInfo());
            bookIndex ++;
        }
    }

    public ArrayList<Book> getAvailableBooks(){
        return library;
    }

    private void menu() {
        System.out.println("Please select an option:");
        System.out.println("1: Show list of available books");
        System.out.println("2: Check out book");
        Scanner userInput = new Scanner(System.in);
        int option = userInput.nextInt();
        while (option != 0) {
            switch (option) {
                case 1:
                    printAvailableBooks();
                    option = userInput.nextInt();
                    continue;

                case 2:
                    System.out.println("Please enter the book index of the book you would like to check out from the list below:");
                    printAvailableBooks();
                    Scanner getTitleFromUser = new Scanner(System.in);
                    int bookIndex = getTitleFromUser.nextInt() - 1;
                    removeBookFromLibrary(bookIndex);
                    continue;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Please select a valid option!");
                    option = Integer.parseInt(userInput.nextLine());
            }
        }
    }

    public void removeBookFromLibrary(int bookIndex) {
        library.get(bookIndex).setAvailable(false);
        library.remove(bookIndex);
    }

    public void populateBooks() {
        final Book scienceBook = new Book("Biology", "John Doe", 1999);
        final Book computerBook = new Book("Computer Design", "Dave Joe", 1998);
        final Book animalBook = new Book("All About Animals", "Rick Sanchez", 2019);
        library.add(scienceBook);
        library.add(computerBook);
        library.add(animalBook);
    }
}
