package com.twu.biblioteca;

public class Book {
    private String bookName;
    private String author;
    private int yearPublished;
    private boolean isAvailable = true;

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

    public void setAvailable(boolean availability) {
        isAvailable = availability;
    }

    public String printBookInfo(){
        //System.out.println(bookName + "\t" + author + "\t" + yearPublished);
        return bookName + "\t" + author + "\t" + yearPublished;
    }
}
