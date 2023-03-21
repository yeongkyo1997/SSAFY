package com.ssafy.day07.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test03_DataComparable {
	static class Data implements Comparable<Data> {
		String name;
		int age;

		public Data(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return name + ", " + age;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public int compareTo(Data o) {
			if (o.name.equals(this.name))
				return age - o.age;
			return name.compareTo(o.name);
		}
	}

	public static void main(String[] args) {
		System.out.println("b".compareTo("b"));
		System.out.println("b".compareTo("c"));
		System.out.println("b".compareTo("a"));
		System.out.println("b".compareTo("가"));

		Data d1 = new Data("손흥민", 30);
		Data d2 = new Data("이병헌", 48);
		Data d3 = new Data("이민정", 44);
		Data d4 = new Data("기안84", 35);

		Data[] arr = { d1, d2, d3, d4 };
		Arrays.sort(arr);

		List<Data> list = Arrays.asList(d1, d2, d3, d4);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
