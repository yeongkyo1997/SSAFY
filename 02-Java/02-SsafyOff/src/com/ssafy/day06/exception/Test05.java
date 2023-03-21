package com.ssafy.day06.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

class App {
	public void service() {
		try {
			init();
			start();
		} catch (Exception e) {
			StackTraceElement[] ste = e.getStackTrace();
			for (StackTraceElement ele : ste) {
				System.out.println(ele.getFileName() + "\t" + ele.getClassName() + "\t" + ele.getMethodName() + "\t"
						+ ele.getLineNumber());
			}
			e.printStackTrace();
		}
	}

	private void start() throws FileNotFoundException {
		FileReader fr = new FileReader("start.properties");
	}

	private void init() {
		System.out.println("기본 정보 세팅");
		System.out.println("세팅 종료");
	}
}

public class Test05 {
	public static void main(String[] args) {
		App app = new App();
		app.service();
	}
}
