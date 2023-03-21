package com.ssafy.c_inheritance.person;

public class SpiderMan extends Person {
	boolean isSpider;
	Spider spider;

	public SpiderMan() {
		super();
		this.spider = new Spider();
	}

	public SpiderMan(String name, boolean isSpider, Spider spider) {
		super(name);
		this.isSpider = isSpider;
		this.spider = spider;
	}

	void fireWeb() {
		// System.out.println("어떻게 쏘지? ㅜㅜ");

		if (this.isSpider) {
			this.spider.fireWeb();
		} else {
			System.out.println("사람일 때는 못쏴요~");
		}
	}

	@Override
	void jump() {
		if (this.isSpider) {
			System.out.println("두 다리로 힘껏 점프");
		} else {
			super.jump();
		}
	}

	@Override
	public String toString() {
		return "SpiderMan [isSpider=" + isSpider + ", spider=" + spider + ", name=" + name + "]";
	}
}
