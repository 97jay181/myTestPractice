package com.ohgiraffers.section03.July.first.Basic;

import java.util.Scanner;

public class Basic04 {

    public static void main(String[] args) {

        /* 주어진 정수가 짝수인지 홀수인지 판별하여 출력하는 프로그램을 작성하세요. */

        Scanner sc = new Scanner(System.in);

        // 정수 입력받기
        System.out.print("정수를 입력해주세요 ~ : ");
        int no = sc.nextInt();

        // 짝수인지 홀수인지 판별해서 출력 하기
        if(no % 2 == 1) {
            System.out.println("해당 정수는 홀수네요~~ ");
        }else {
            System.out.println("오우 해당 정수는 짝수네요~~~");
        }
    }
}
