package com.ssafy.day07.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Test04_DataComparator {

	public static void main(String[] args) {
		Data d1 = new Data("더글로리", "송혜교", 2022);
		Data d2 = new Data("나의아저씨", "아이유", 2015);
		Data d3 = new Data("주몽", "송일국", 2006);
		Data d4 = new Data("미스터선샤인", "김태리", 2019);

		Data[] arr = { d1, d2, d3, d4 };
		// Arrays.sort(arr, new DataComparator());
		Arrays.sort(arr, new Comparator<Data>() {
			@Override
			public int compare(Data o1, Data o2) {
				return o1.year - o2.year;
			}
		});
		Arrays.sort(arr, (o1, o2) -> o1.year - o2.year);
		System.out.println(Arrays.toString(arr));
	}
}

class DataComparator implements Comparator<Data> {
	@Override
	public int compare(Data o1, Data o2) {
		return o1.year - o2.year;
	}
}

class Data {
	String title;
	String name;
	int year;

	public Data(String title, String name, int year) {
		this.title = title;
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return String.format("%s-%s-%d", title, name, year);
	}
}
