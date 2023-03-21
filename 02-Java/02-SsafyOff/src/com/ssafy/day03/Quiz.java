package com.ssafy.day03;

class Single {
	private Single() {

	}

	private static Single instance = new Single();

	public synchronized static Single getInstance() {
		if (instance == null)
			instance = new Single();
		return instance;
	}
}

public class Quiz {
	public static void main(String[] args) {
		Single s = Single.getInstance();
	}
}
