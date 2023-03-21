package com.ssafy.day06.exception;

class 물건사라짐Exception extends Exception {
	String e;

	public 물건사라짐Exception() {
		super();
	}

	public 물건사라짐Exception(String e) {
		super();
		this.e = e;
	}
}

class 사장 {
	public void 영업시작() {
		알바 alba = new 알바();
		try {
			alba.일하다();
		} catch (Exception e) {
			System.out.println("사장 에러 상황 정리함...");
		}
	}
}

class 알바 {
	public void 일하다() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("알바 예외 상황 정리시작...");
			// throw new 물건사라짐Exception("물건이 사라짐: " + e.getMessage());
			throw e;
		}
	}
}

public class Test04 {
	public static void main(String[] args) {
		사장 boss = new 사장();
		boss.영업시작();
	}
}
