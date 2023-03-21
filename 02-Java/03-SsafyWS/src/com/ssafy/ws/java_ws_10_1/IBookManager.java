package com.ssafy.ws.java_ws_10_1;

import java.io.IOException;

/**
 * 도서리스트를 관리하기 위한 클래스를 위한 명세역할의 인터페이스
 */
public interface IBookManager {
    void add(Book book);

    void remove(String isbn);

    Book[] getList();

    Book searchByIsbn(String isbn) throws ISBNNotFoundException;

    Book[] searchByTitle(String title);

    Magazine[] getMagazines();

    // Book[] getBooks();

    int getTotalPrice();

    double getPriceAvg();

    void sell(String isbn, int quantity) throws ISBNNotFoundException;

    void buy(String isbn, int quantity) throws ISBNNotFoundException;

    void saveData() throws IOException;
}
