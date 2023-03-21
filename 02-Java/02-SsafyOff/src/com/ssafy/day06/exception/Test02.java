package com.ssafy.day06.exception;

class MyException extends Exception {
}

class MyRuntimeException extends RuntimeException {

}

public class Test02 {

	public static void main(String[] args) {
		// throw new MyRuntimeException();
		// Unhandled exception type MyException
		try {
			throw new MyException();
		} catch (MyException me) { // MyException me = new MyException();
			System.out.println("error");
		}
	}

}
