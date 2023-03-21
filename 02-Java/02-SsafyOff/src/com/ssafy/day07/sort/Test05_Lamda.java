package com.ssafy.day07.sort;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Parent01 {
	void call(String msg);
}

/*
 * class Child implements Parent01 {
 * 
 * @Override public void call(String msg) { System.out.println("<<" + msg +
 * ">>"); } }
 */

class Child2 implements Parent01 {
	@Override
	public void call(String msg) {
		System.out.println("{{" + msg + "}}");
	}
}

public class Test05_Lamda {
	static void test(Parent01 p) {
		p.call("hello");
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "aa", "aaa");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		List<Integer> l = Arrays.asList(1, 2, 3, 4);

		Parent01 p = new Parent01() {
			@Override
			public void call(String msg) {
				System.out.println("<<" + msg + ">>");
			}
		};

		test(msg -> System.out.println("{{" + msg + "}}"));
		p.call("hello");
	}
}
