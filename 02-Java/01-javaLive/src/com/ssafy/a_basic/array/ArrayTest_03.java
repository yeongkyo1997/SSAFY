package com.ssafy.a_basic.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest_03 {
    public static void main(String[] args) {

        int N = 6;
        Random rand = new Random();
        // TODO: 1~6까지의 random 정수 5개를 저장할 배열을 만들고 값을 저장하시오.
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(6) + 1;
        }

        // END:
        System.out.println(Arrays.toString(arr));

        // TODO: 위 배열에 저장된 요소 중 짝수만 더해서 합을 출력하시오.
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        // END:
        System.out.println("짝수의 합: " + sum);
    }
}
