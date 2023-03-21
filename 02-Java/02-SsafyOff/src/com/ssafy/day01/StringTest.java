package com.ssafy.day01;

import java.util.regex.Pattern;

public class StringTest {
	/*
	 * 자바의 문자열 관련 API 클래스
	 * 
	 * 불변 (immutable)
	 * 
	 * String
	 * 
	 * 가변 (mutable)
	 * 
	 * StringBuffer
	 * 
	 * StringBuilder
	 * 
	 */
	static void exam01() {
		String str1 = "a";
		StringBuffer str2 = new StringBuffer("a");
		StringBuilder str3 = new StringBuilder("a");

		System.out.println(str1.concat("b"));
		System.out.println(str2.append("b"));
		System.out.println(str3.append("b"));

		str1 = str1.concat("b");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		String str4 = "a";
		String str5 = "a";
		String str6 = new String("a");
		System.out.println(str4 == str5);
		System.out.println(str5 == str6);
		System.out.println(str5.equals(str6));
	}

	public static void main(String[] args) {
		exam01();
		// exam02();
		exam03();
		String result = exam04("Hi12323123213123");

		String s = "http://www.naver.com";
		System.out.println(s.startsWith("http://"));

		s = "flower.jpg";
		System.out.println(s.endsWith(".jpg"));

		String contextPath = "/myserver";
		s = "/myserver/login?id=a&pass=b";

		System.out.println(s.substring(contextPath.length()));
	}

	private static String exam04(String str) {
		// 숫자제거
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				continue;
			}
			sb.append(ch);
		}

		return sb.toString();
	}

	private static void exam03() {
		String s = "Hello";
		char ch = s.charAt(0);
		System.out.println(ch);

		System.out.println(s.length());

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		s = "199706060";
		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		s = "Hello";
		if (s.equals("hello")) {
			System.out.println("equals는 대소문자 비교");
		}
		if (s.equalsIgnoreCase("hello")) {
			System.out.println("equalsIgnoreCase는 대소문자 무시하고 비교");
		}

		s = s.toUpperCase();
		System.out.println(s);
		s = s.toLowerCase();
		System.out.println(s);

		s = "Hello Java";
		System.out.println(s);
		int idx = s.indexOf("a");
		System.out.println(idx);

		idx = s.indexOf("a", idx + 1);
		System.out.println(idx);

		idx = s.lastIndexOf("a");
		System.out.println(idx);

		idx = s.lastIndexOf("a", idx - 1);
		System.out.println(idx);

		boolean find = s.contains("llo");
		System.out.println(find);

		// 문자열로 만들기 +, valueOf
		String data = 100 + "";
		data = String.valueOf(100);

		data = "     H E L L O    ";
		data = data.trim();
		System.out.println(data);

		data = data.replaceAll(" ", "");
		System.out.println(data);

	}

	private static void exam02() {
		String s1 = "a";
		long s = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s1 += i;
		}
		System.out.println("String 걸린 시간 : " + ((System.currentTimeMillis() - s) / 1000d));

		// 동기화 처리가 되어있는 클래스
		StringBuffer s2 = new StringBuffer("a");
		s = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s2.append(i);
		}
		System.out.println("StringBuffer 걸린 시간 : " + ((System.currentTimeMillis() - s) / 1000d));

		// 동기화 처리가 되어있지 않은 클래스
		StringBuilder s3 = new StringBuilder("a");
		s = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s3.append(i);
		}
		System.out.println("StringBuilder 걸린 시간 : " + ((System.currentTimeMillis() - s) / 1000d));
	}

	static class MyString {
	}
}
