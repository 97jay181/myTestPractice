package com.ohgiraffers.section03.July.first.Hard;

import java.util.Scanner;

public class Hard01 {

    public static void main(String[] args) {
        /* 원의 반지름을 입력받아 원의 둘레와 넓이를 계산하여 출력하는 프로그램을 작성하세요. (단, PI는 상수로 선언하여 사용하세요)*/
        // 원주율 상수 선언
        final double PI = Math.PI;

        Scanner sc = new Scanner(System.in);
        // 원의 반지름 입력받기
        System.out.println("반지름의 길이를 숫자로 입력하시오 ");
        double radius = sc.nextDouble();

        // 원의 둘레 계산
        double circumference = (2 * PI * radius);

        // 원의 넓이 계산
        double area = (PI * radius * radius);

        // 결과 출력
        System.out.println("원의 둘레: " + circumference);
        System.out.println("원의 넓이: " + area);

        sc.close();



    }

}
