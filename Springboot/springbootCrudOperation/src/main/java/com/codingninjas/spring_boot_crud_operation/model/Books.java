package com.codingninjas.spring_boot_crud_operation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Books {
    @Id
    @Column
    private int bookid;

    @Column
    private String bookname;

    @Column
    private String author;

    @Column
    private int price;

    // Constructor
    public Books() {}

    public Books(int bookid, String bookname, String author, int price) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters
    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // toString method
    @Override
    public String toString() {
        return "Books{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}