package com.ssafy.ws.java_ws_10_1;

import java.util.Arrays;

/**
 * BookManager 클래스를 이용하여 도서 객체 추가,삭제,조회하는 클래스
 */
public class BookTest {
    public static void main(String[] args) {
        IBookManager bm = new BookManagerImpl();
        Book book1 = new Book("21424", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기본 문법", 10);
        Book book2 = new Book("21425", "Java Pro2", "김하나", "jaen.kr", 25000, "Java 응용", 20);
        bm.add(book1);
        bm.add(book2);
        bm.saveData();
        System.out.println(Arrays.toString(bm.getList()));
    }
}
