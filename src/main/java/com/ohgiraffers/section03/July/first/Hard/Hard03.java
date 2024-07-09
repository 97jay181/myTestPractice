package com.ohgiraffers.section03.July.first.Hard;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Hard03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 정수 입력 받기
        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = sc.nextInt();

        // 최대공약수를 구하는 메소드 호출
        int gcd = findGCD(num1, num2);

        // 결과 출력
        System.out.println("두 정수 " + num1 + "과 " + num2 + "의 최대공약수: " + gcd);

        sc.close();
    }

    // 최대공약수를 구하는 static 메소드
    // 유클리드 호제법 사용 - 두 수의 나머지를
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
