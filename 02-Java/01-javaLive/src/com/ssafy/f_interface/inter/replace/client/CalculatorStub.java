package com.ssafy.f_interface.inter.replace.client;

import com.ssafy.f_interface.inter.replace.Calculator;

class CalculatorStub implements Calculator {
  public int add(int a, int b) {
    System.out.printf("파라미터 확인: %d, %d%n", a, b);
    return 0;
  }
}
