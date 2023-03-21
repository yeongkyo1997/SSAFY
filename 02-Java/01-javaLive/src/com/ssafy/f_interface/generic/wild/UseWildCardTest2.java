package com.ssafy.f_interface.generic.wild;

import com.ssafy.f_interface.generic.box.GenericBox;

public class UseWildCardTest2 {

    public void useWildCardTypeMethod() {
        GenericBox<Double> dBox = new GenericBox<>();
        dBox.setSome(3.14);
        printInfo(dBox);

        GenericBox<Integer> iBox = new GenericBox<>();
        iBox.setSome(3);
        printInfo(iBox);

    }

    // TODO:GenericBox<Double>과 GenericBox<Integer>의 내용을 확인하는 메서드를 작성해보자.
    // END:

    public static void main(String[] args) {
        UseWildCardTest2 test = new UseWildCardTest2();
        test.useWildCardTypeMethod();
    }
}
