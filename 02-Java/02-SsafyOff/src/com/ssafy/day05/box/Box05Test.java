package com.ssafy.day05.box;

interface Drink {
}

class Sprite implements Drink {
}

interface Burger {
}

class HamBurger implements Burger {
}

class BurgerSet<D, B> implements Drink, Burger {
}

class MixBox<T extends Drink & Burger> {
}

public class Box05Test {
	public static void main(String[] args) {
		// MixBox<HamBurger> box = new MixBox<>();
		// MixBox<Sprite> box = new MixBox<>();
		MixBox<BurgerSet<Sprite, HamBurger>> box = new MixBox<>();
	}
}
