package com.ohgiraffers.section01.practice01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        System.out.print("Multiples of 3: ");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }

        System.out.println("\nSum of multiples of 3 up to " + n + " is " + sum);
    }
}