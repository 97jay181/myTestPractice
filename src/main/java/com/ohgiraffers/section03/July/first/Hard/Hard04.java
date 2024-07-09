package com.ohgiraffers.section03.July.first.Hard;

import java.util.Scanner;

public class Hard04 {

    public static void main(String[] args) {

        /* 사용자로부터 5개의 정수를 입력받아 배열에 저장하고, 배열에 저장된 값 중 최대값을 찾아 출력하는 프로그램을 작성하세요. */

        Scanner sc = new Scanner(System.in);

        // 5개의 정수를 저장할 배열 선언
        int[] numbers = new int[5];

        // 사용자로부터 정수 입력 받기
        System.out.println("정수 5개를 입력하세요");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "번째 정수: ");
            numbers[i] = sc.nextInt();
        }

        // 배열에서 최대값 찾기
        int max = numbers[0]; // 배열의 첫 번째 원소로 초기화
                              // 배열의 첫 번째 원소는 numbers[0]이다.
                              // 배열에서 최대값을 찾기 위해 max 변수를 numbers[0]으로 초기화해야 한다.
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // 최대값 출력
        System.out.println("입력한 정수들 중 최대값: " + max);

        sc.close();
    }
}
