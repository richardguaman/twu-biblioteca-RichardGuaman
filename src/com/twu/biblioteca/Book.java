package com.twu.biblioteca;

public class Book {
    private String BookName;

    Book(String BookName){
        this.BookName = BookName;
    }

    public String getBookName(){
        return BookName;
    }
}
