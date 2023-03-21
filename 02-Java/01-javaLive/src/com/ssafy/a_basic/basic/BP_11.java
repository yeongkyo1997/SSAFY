package com.ssafy.a_basic.basic;

public class BP_11 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		// TODO: 다음에서 발생하는 오류를 읽고 원인을 말한 후 수정하시오.
		// 정수형 연산의 기본은 int라서 b1 + b2는 int형으로 형변환이 되기 때문에 byte에 넣으면 오류가 발생한다.
		byte b3 = (byte) (b1 + b2);

		int i1 = 10;
		long l1 = 20;
		// TODO: 다음에서 발생하는 오류를 읽고 원인을 말한 후 수정하시오.
		// long은 int보다 범위가 크기 때문에 명시적 형변환이 되지 않는다.
		int i2 = (int) (i1 + l1);

		// TODO: 다음에서 발생하는 오류를 읽고 원인을 말한 후 수정하시오.
		float f1 = 10.0f;
		float f2 = f1 + 20.0f;

		System.out.println(b3);
		System.out.println(i2);
		System.out.println(f1);
		System.out.println(f2);
	}

}
