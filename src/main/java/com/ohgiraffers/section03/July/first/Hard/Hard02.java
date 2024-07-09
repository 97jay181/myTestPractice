package com.ohgiraffers.section03.July.first.Hard;

import java.util.Scanner;

public class Hard02 {

    public static void main(String[] args) {

        /* 사용자로부터 세 정수를 입력받아 모두 양수인 경우에만 "모두 양수입니다."를 출력하는 프로그램을 작성하세요. */

        Scanner sc = new Scanner(System.in);

        // 세 정수 입력 받기
        System.out.print("첫번째 정수를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수를 입력하세요: ");
        int num2 = sc.nextInt();
        System.out.print("세번째 정수를 입력하세요: ");
        int num3 = sc.nextInt();

        // 모든 수가 양수인지 판별
        if (num1 > 0 && num2 > 0 && num3 > 0) {
            System.out.println("모두 양수입니다.");
        } else {
            System.out.println("입력한 수 중에 양수가 아닌 수가 있습니다.");
        }

        sc.close();
    }
}
