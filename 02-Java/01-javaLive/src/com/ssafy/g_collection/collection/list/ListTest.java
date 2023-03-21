package com.ssafy.g_collection.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	// 문자열을 저장할 List, 구현체는 ArrayList
	List<String> friends = new ArrayList<>();

	public static void main(String[] args) {

		ListTest alt = new ListTest();
		alt.createTest();
		alt.retrieveTest();
		alt.updateTest();
		alt.deleteTest();
	}

	public void createTest() {
		// TODO: friends에 여러명의 친구를 등록해보자.
		friends.add("홍길동");
		friends.add("장길산");
		friends.add("홍길동"); // 데이터 중복!!
		friends.add("임꺽정");
		friends.add(0, "이몽룡");
		friends.add(0, "인영교");
		// END:
		System.out.println("추가 후 내용 출력: " + friends);
	}

	public void retrieveTest() {
		// TODO: 다양한 조회 기능을 사용해보자.
		System.out.println("list의 size? " + friends.size());
		for (int i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i));
		}
		for (String friend : friends) {
			System.out.println(friend);
		}
		System.out.println(friends.contains("인영교"));
		System.out.println(friends.indexOf("임꺽정"));
		System.out.println(friends.indexOf("인영교"));
		System.out.println(friends.isEmpty() ? "비어있음" : "안 비어있음");
		// END:
	}

	public void updateTest() {
		// TODO: 홍길동이 있다면 값을 율도국 왕으로 변경해보자.
		while (friends.contains("홍길동")) {
			int idx = friends.indexOf("홍길동");
			friends.set(idx, "율도국왕");
		}
		System.out.println("수정 후 : " + friends);

		// END:
	}

	public void deleteTest() {
		// TODO: 0번째 친구와 율도국 왕을 삭제하시오.
		friends.remove(0);
		friends.remove("율도국왕");
		// END:
		System.out.println("삭제 후 : " + friends);
		friends.clear();// 리스트 초기화;
		System.out.println("초기화 후 : " + friends);

		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);

		l.remove(Integer.valueOf(1));
		System.out.println(l);
	}
}
