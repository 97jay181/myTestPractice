package com.ohgiraffers.section03.July.first.Basic;

import static java.lang.Integer.sum;

public class Basic03 {


    /* 두 정수를 매개변수로 받아 그 합을 반환하는 메소드를 작성하고, 해당 메소드를 호출하여 결과를 출력하세요. */

    // 두 정수를 매개변수로 받아 그 합을 반환하는 메소드
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // 두 정수 5와 10을 전달하여 합을 계산
        int result = sum(5, 10);

        // 결과를 출력
        System.out.println("두 정수의 합: " + result);
    }
}

