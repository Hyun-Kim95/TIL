package com.android.booksapplication;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Book implements Parcelable {
    private int num;
    private String title;
    private String author;
    private String publisher;
    private String summary;
    private int rental;

    public Book(String title, String author, String publisher, String summary) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.summary = summary;
    }

    public Book(int num, String title, String author, String publisher, String summary, int rental) {
        this.num = num;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.summary = summary;
        this.rental = rental;
    }

    protected Book(Parcel in) {
        num = in.readInt();
        title = in.readString();
        author = in.readString();
        publisher = in.readString();
        summary = in.readString();
        rental = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(num);
        dest.writeString(title);
        dest.writeString(author);
        dest.writeString(publisher);
        dest.writeString(summary);
        dest.writeInt(rental);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

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
