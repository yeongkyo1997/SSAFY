package com.ssafy.f_interface.generic.box;

public class UseBoxTest {

	public static void main(String[] args) {
		useNormalBox();
		useGenericBox();
		useNumberBox();
	}

	private static void useNormalBox() {
		// TODO: NormalBox 타입의 객체를 생성하고 사용해보세요.
		// END:
	}

	private static void useGenericBox() {
		// TODO: GenericBox 타입의 객체를 생성하고 사용해보세요.
		// END:
	}

	private static void useNumberBox() {
		// TODO: NumberBox 타입의 객체를 생성하고 사용해보세요.
		NumberBox<Number> box = new NumberBox<>();
		box.addSomes(1, 10, 11.1);
		NumberBox<Integer> box2 = new NumberBox<>();
		// END:
	}

}
