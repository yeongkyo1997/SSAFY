package com.ssafy.ws.java_ws_10_1;

import java.io.Serializable;

/**
 * 도서 정보를 나타내는 클래스
 */
public class Book implements Serializable { // 객체 직렬화 가능하도록 Serializable 인터페이스 구현
    // 코드를 작성해주세요.
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private int price;
    private String desc;
    private int quantity;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Book(String isbn, String title, String author, String publisher, int price, String desc, int quantity) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.desc = desc;
        this.quantity = quantity;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return String.format("%-15s| %-15s| %-15s| %-15s| %-15d| %-15s| %-15d\r\n", isbn, title, author, publisher, price,
                desc, quantity);
    }
}
