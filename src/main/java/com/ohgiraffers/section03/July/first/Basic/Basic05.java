package com.ohgiraffers.section03.July.first.Basic;

public class Basic05 {
    public static void main(String[] args) {
        /* 길이가 5인 정수형 배열을 선언하고, 배열의 각 요소에 1부터 5까지의 값을 할당한 후, 배열의 요소들을 출력하세요. */

        // 길이가 5인 정수형 배열 선언
        int[] array = new int[5];

        // 배열의 각 요소에 1 ~ 5 까지의 값을 할당
        for(int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // 배열의 요소들을 출력
        System.out.println("배열의 요소 :  ");
        for (int v : array) {
            System.out.print(v);
        }
    }
}
