package com.ssafy.day06.exception;

class MyClose implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("MyClose - close() 호출됨");
	}
}

public class Test07 {
	public static void main(String[] args) {
		// The resource type Myclose does not
		// implement java.lang.AutoCloseable
		try (MyClose mc = new MyClose();) {
			System.out.println("try 시작");
			System.out.println(1 / 0);
			System.out.println("try 종료");
		} catch (Exception e) {
			System.out.println("예외 발생");
		}
		System.out.println("try 블럭 밖");
		// // AutoCloseable 구현
		// try (FileReader fr = new FileReader("Test4.txt"); BufferedReader br = new
		// BufferedReader(fr);) {
		//
		// while (true) {
		// String line = br.readLine();
		//
		// if (line == null)
		// break;
		// System.out.println(line);
		// }
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
	}
}
