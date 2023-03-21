package com.ssafy.off;

import java.math.BigInteger;

public class Fact {
	public static void main(String[] args) {
		int n = 1000;
		System.out.println(fact(BigInteger.valueOf(n)));

	}

	static BigInteger fact(BigInteger n) {
		if (n.equals(BigInteger.ONE))
			return BigInteger.ONE;
		return n.multiply(fact(n.subtract(BigInteger.ONE)));

	}
}
