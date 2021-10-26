package com.android.librarytest;

public class BooksDTO {
    private int num;
    private String title;
    private String author;
    private String publisher;
    private String summary;
    private int rental;

    public BooksDTO(int num, String title, String author, String publisher, String summary, int rental){
        this.num = num;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.summary = summary;
        this.rental = rental;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getRental() {
        return rental;
    }

    public void setRental(int rental) {
        this.rental = rental;
    }
}
