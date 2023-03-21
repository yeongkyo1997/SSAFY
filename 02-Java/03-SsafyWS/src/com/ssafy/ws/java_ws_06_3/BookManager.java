package com.ssafy.ws.java_ws_06_3;

import java.util.Arrays;

public class BookManager {
	private final int MAX_SIZE = 100;
	private Book[] books = new Book[MAX_SIZE];
	private int size = 0;

	public void add(Book book) {
		if (size > MAX_SIZE)
			System.out.println("더 이상 추가할 수 없습니다.");
		else {
			books[size++] = book;
		}
	}

	public void remove(String isbn) {
		int idx = 0;
		boolean isRemove = false;
		Book[] tmp = new Book[MAX_SIZE];
		for (int i = 0; i < size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				isRemove = true;
				continue;
			}
			tmp[idx++] = books[i];
		}
		if (isRemove) {
			books = tmp;
			size--;
		}
	}

	public Book[] getList() {
		return Arrays.copyOf(books, size);
	}

	public Book searchByIsbn(String isbn) {
		Book result = null;

		for (int i = 0; i < this.size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				result = books[i];
			}
		}
		return result;
	}

	public Book[] searchByTitle(String title) {
		Book[] result;
		int cnt = 0;

		for (int i = 0; i < size; i++) {
			if (books[i].getTitle().contains(title)) {
				cnt++;
			}
		}
		result = new Book[cnt];
		int idx = 0;

		for (int i = 0; i < size; i++) {
			if (books[i].getTitle().contains(title)) {
				result[idx++] = books[i];
			}
		}
		return result;
	}

	public Magazine[] getMagazines() {
		Magazine[] result;
		int cnt = 0;
		int idx = 0;

		for (int i = 0; i < size; i++) {
			if (books[i] instanceof Magazine) {
				cnt++;
			}
		}

		result = new Magazine[cnt];
		for (int i = 0; i < size; i++) {
			if (books[i] instanceof Magazine) {
				result[idx++] = (Magazine) books[i];
			}
		}
		return result;
	}

	public Book[] getBook() {
		return Arrays.copyOf(books, size);
	}

	public int getTotalPrice() {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += books[i].getPrice();
		}
		return sum;
	}

	public double getPriceAvg() {
		int sum = this.getTotalPrice();

		return sum / (double) (size);
	}
}
