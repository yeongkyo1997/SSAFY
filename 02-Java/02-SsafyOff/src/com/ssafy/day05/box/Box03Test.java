package com.ssafy.day05.box;

class Box03<T> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return getData().toString();
	}
}

public class Box03Test {
	public static void main(String[] args) {
		Box03<String> box = new Box03<String>();
		box.setData("귤");
		String data = box.getData();
		// box.setData(100);
	}
}