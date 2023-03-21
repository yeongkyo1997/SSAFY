package com.ssafy.day05.box;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Box04<K, V> {
	private K key;
	private V value;

	Box04(K key, V value) {
		this.key = key;
		this.value = value;
	}
}

public class Box04Test {
	public static void main(String[] args) {
		// Box04<String, Integer> box = new Box04<String, Integer>("싸피", 1234);
		Map<String, Map<Integer, List<String>>> map = new HashMap<>();

		List<Integer> list = new ArrayList<>();
		Iterator ite = list.iterator();
	}
}