package com.ssafy.day05.box;

public class Box02Test {
	public static void main(String[] args) {
		Box2 box = new Box2();
		box.setData("귤");
		// String data = box.getData();
		box.setData(100);
	}
}

class Box2 {
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return getData().toString();
	}
}