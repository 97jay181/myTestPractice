package com.ohgiraffers.section01.practice01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " -> 윤년입니다.");
        } else {
            System.out.println(year + " -> 윤년이 아닙니다.");
        }
    }
}