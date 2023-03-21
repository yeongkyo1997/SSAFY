package com.ssafy.c_inheritance.person;

public class SpiderManTest {

	public static void main(String[] args) {
		SpiderMan sman = new SpiderMan();
		sman.isSpider = false;
		sman.name = "피터파커";
		sman.eat();
		sman.jump();
		sman.isSpider = true;
		sman.fireWeb();
		sman.eat("젓가락");
		sman.jump();
		System.out.println(sman.toString());
	}
}
