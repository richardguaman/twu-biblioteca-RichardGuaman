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
        for (Book book : getAvailableBooks()) {
                System.out.println(book.printBookInfo());
        }
    }

    public ArrayList<Book> getAvailableBooks() {
        ArrayList<Book> availableBooks = new ArrayList<Book>();
        for (Book book : library) {
            if (book.getAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    private void menu() {
        System.out.println("Please select an option:");
        System.out.println("1: Show list of available books");
        System.out.println("2: Check out book");
        System.out.println("3: Return a book");
        Scanner userInput = new Scanner(System.in);
        int option = userInput.nextInt();
        while (option != 0) {
            switch (option) {
                case 1:
                    printAvailableBooks();
                    option = userInput.nextInt();
                    break;

                case 2:
                    System.out.println("Please enter the book title of the book you would like to check out from the list below:");
                    printAvailableBooks();
                    Scanner getTitleFromUser = new Scanner(System.in);
                    String bookTitle = getTitleFromUser.nextLine();
                    try {
                        removeBookFromLibrary(bookTitle);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Thank you! Enjoy the book");
                    option = userInput.nextInt();
                    break;

                case 3:
                    System.out.println("Please enter the title of the book you are trying to return from the options below:");
                    printCheckedOutBooks();
                    Scanner getReturnTitleFromUser = new Scanner(System.in);
                    String returnedBookTitle = getReturnTitleFromUser.nextLine();
                    returnBookToLibrary(returnedBookTitle);
                    option = userInput.nextInt();
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Please select a valid option!");
                    option = Integer.parseInt(userInput.nextLine());
            }
        }
    }

    public void returnBookToLibrary(String returnedBookTitle) {
        for(Book book : getCheckedOutBooks()){
            if(book.getBookName().equals(returnedBookTitle)){
                book.setAvailable(true);
                break;
            }
        }
    }

    private void printCheckedOutBooks() {
        for(Book book : getCheckedOutBooks()){
            System.out.println(book.printBookInfo());
        }
    }

    public ArrayList<Book> getCheckedOutBooks() {
        ArrayList<Book> checkedOutBooks = new ArrayList<Book>();
        for (Book book : library) {
            if (!book.getAvailable()) {
                checkedOutBooks.add(book);
            }
        }
        return checkedOutBooks;
    }


    public void removeBookFromLibrary(String bookTitle) throws Exception {
        boolean bookFound = false;
        for(Book book : getAvailableBooks()){
            if(book.getBookName().equals(bookTitle)){
                book.setAvailable(false);
                bookFound = true;
                break;
            }
        }
        if(!bookFound){
            throw new Exception("Sorry that book is not available.");
        }
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
