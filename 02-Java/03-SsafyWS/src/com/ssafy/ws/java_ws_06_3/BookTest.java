package com.ssafy.ws.java_ws_06_3;

import java.util.Arrays;

public class BookTest {
	public static void main(String[] args) {
		BookManager bm = new BookManager();
		bm.add(new Book("21424", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기본 문법"));

		System.out.println(Arrays.toString(bm.getList()));
	}
}
