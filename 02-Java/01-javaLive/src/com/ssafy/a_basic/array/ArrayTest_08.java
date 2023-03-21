package com.ssafy.a_basic.array;

public class ArrayTest_08 {
	public static void main(String[] args) {
		String[] students = { "홍길동", "임꺽정", "장길산", "이몽룡" };
		// TODO: 배열에서 임꺽정과 장길산의 위치를 변경해서 출력하시오.
		int i1 = 0, i2 = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals("임꺽정")) {
				i1 = i;
			}
			if (students[i].equals("장길산")) {
				i2 = i;
			}
		}
		String temp = students[i1];
		students[i1] = students[i2];
		students[i2] = temp;
		for (String s : students) {
			System.out.println(s);
		}
		// END:
	}
}
