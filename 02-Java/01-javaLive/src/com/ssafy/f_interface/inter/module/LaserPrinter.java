package com.ssafy.f_interface.inter.module;

public class LaserPrinter implements Printer {

	@Override
	public void print(String fileName) {
		System.out.printf("레이저 프린터 : " + fileName);
	}

}
