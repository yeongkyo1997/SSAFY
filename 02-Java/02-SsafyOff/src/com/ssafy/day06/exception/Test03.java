package com.ssafy.day06.exception;

import java.io.FileReader;
import java.io.IOException;

class MyException extends Exception {

}

class MyRuntimeException extends RuntimeException {

}

public class Test03 {
	public static void main(String[] args) {
		try {
			// 예외 발생할 만한 코드를 묶는다.
			// Unhandled exception type FileNotFoundException
			FileReader fr = new FileReader("a.txt");
			// IOException
			int ch = fr.read();

			System.out.println(1 / 0);
			String msg = null;
			int len = msg.length();
			System.out.println(len);
		}
		// FileNotFoundException e = new FileNotFoundException()
		catch (ArithmeticException | NullPointerException | IOException e) {
			System.out.println("에러 발생");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 예외 발생 여부와 상관없이 무조건 실행할 코드
		}
	}
}
