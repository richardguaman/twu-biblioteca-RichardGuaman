package com.twu.biblioteca;

public class Book {
    private String bookName;
    private String author;
    private int yearPublished;

    Book(String bookName, String author, int yearPublished){
        this.bookName = bookName;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getBookName(){
        return bookName;
    }
    public String getAuthor(){
        return author;
    }
    public int getYearPublished(){
        return yearPublished;
    }

    public String printBookInfo(){
        //System.out.println(bookName + "\t" + author + "\t" + yearPublished);
        return bookName + "\t" + author + "\t" + yearPublished;
    }
}
