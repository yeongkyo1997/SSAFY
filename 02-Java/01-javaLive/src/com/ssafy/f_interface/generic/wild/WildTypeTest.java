package com.ssafy.f_interface.generic.wild;

public class WildTypeTest {
	@SuppressWarnings("unused")
	public void wildCardTest() {
		PersonBox<Object> pObj = new PersonBox<>();
		PersonBox<Person> pPer = new PersonBox<>();
		PersonBox<SpiderMan> pSpi = new PersonBox<>();

		// 어떤 타입이 오던지 다 받아줄 수 있다.
		PersonBox<?> pAll = new PersonBox<Object>();
		pAll = pSpi;
		pAll = pObj;

		// Person 또는 상속받은 경우만 받아줄 수 있다.
		PersonBox<? extends Person> pChildPer = null; // new PersonBox<Object>();
		pChildPer = pSpi;
		// pChildPer = pObj;

		// Person 또는 조상만 받아줄 수 있다.
		PersonBox<? super Person> pSuperPer = pPer;
		// pSuperPer = pSpi;
		pSuperPer = pObj;
	}
}

class Person {
}

class SpiderMan extends Person {
}

class PersonBox<T> {
}
