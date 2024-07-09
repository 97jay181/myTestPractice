package com.ohgiraffers.section03.July.first.Normal;

import java.util.Scanner;

public class Normal02 {

    public static void main(String[] args) {

        /* 정수형 변수 score에 85를 할당하고, 삼항 연산자를 이용하여 score가 90 이상이면 "A", 80 이상이면 "B", 나머지는 "C"를 출력하는 프로그램을 작성하세요.  */

        Scanner sc = new Scanner(System.in);

        // 정수형 변수 score에 85를 할당
        int score = 85;

        // 삼항 연산자를 이용하여 학점을 결정
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : "C";

        // 결과 출력
        System.out.println("점수: " + score);
        System.out.println("학점: " + grade);
    }
}


