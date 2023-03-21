package com.ssafy.ws.java_ws_10_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 도서리스트를 컬렉션으로 유지하며 관리하는 클래스
 */
public class BookManagerImpl implements IBookManager {
    private List<Book> books = new ArrayList<>();
    private static File file = new File("book.dat");
    private static IBookManager instance;

    public static IBookManager getInstance() {
        return instance;
    }

    public void add(Book book) {
        books.add(book);
    }

    public void remove(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                books.remove(i);
                break;
            }
        }
    }

    public Book[] getList() {
        Book[] result = new Book[books.size()];
        for (int i = 0; i < books.size(); i++) {
            result[i] = books.get(i);
        }
        return result;
    }

    public Book searchByIsbn(String isbn) throws ISBNNotFoundException {
        Book result = null;
        for (int i = 0; i < books.size(); i++) {
            if (isbn.equals(books.get(i).getIsbn())) {
                result = books.get(i);
            }
        }
        if (result == null) {
            throw new ISBNNotFoundException(isbn);
        }
        return result;
    }

    public Book[] searchByTitle(String title) {
        Book[] result;
        int cnt = 0;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().contains(title)) {
                cnt++;
            }
        }

        result = new Book[cnt];
        int idx = 0;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().contains(title)) {
                result[idx++] = books.get(i);
            }
        }
        return result;
    }

    public Magazine[] getMagazines() {
        Magazine[] result;
        int cnt = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i) instanceof Magazine) {
                cnt++;
            }
        }

        result = new Magazine[cnt];
        int idx = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i) instanceof Magazine) {
                result[idx++] = (Magazine) books.get(i);
            }
        }
        return result;
    }

    // public Book[] getBooks() { }

    public int getTotalPrice() {
        int result = 0;
        for (int i = 0; i < books.size(); i++) {
            result += books.get(i).getPrice();
        }
        return result;
    }

    public double getPriceAvg() {
        return getTotalPrice() / (double) books.size();
    }

    public void sell(String isbn, int quantity) throws ISBNNotFoundException {
        Book sellBook = searchByIsbn(isbn);
        if (sellBook.getQuantity() < quantity) {
            System.out.println("수량이 부족합니다.");
        } else {
            sellBook.setQuantity(sellBook.getQuantity() - quantity);
        }
    }

    public void buy(String isbn, int quantity) throws ISBNNotFoundException {
        Book buyBook = searchByIsbn(isbn);
        buyBook.setQuantity(buyBook.getQuantity() + quantity);
    }

    private void loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            FileWriter fw = new FileWriter(file);
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));) {
            oos.writeObject(books);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
