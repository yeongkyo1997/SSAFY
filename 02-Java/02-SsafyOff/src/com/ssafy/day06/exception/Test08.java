package com.ssafy.day06.exception;

import java.util.Random;

class LottoNumberException extends RuntimeException {
}

class LottoService {
	private static final int MAX_NUM = 500;

	public int makeNumber() {
		Random r = new Random();
		int num = r.nextInt(MAX_NUM) + 1;
		if (num > 45) {
			throw new LottoNumberException();
		}
		return num;
	}
}

public class Test08 {
	public static void main(String[] args) {
		LottoService service = new LottoService();
		try {
			System.out.println(service.makeNumber());
		} catch (Exception e) {
			System.out.println("예");
		}
	}
}
