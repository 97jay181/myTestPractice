package com.ohgiraffers.section03.July.first.Hard;

// Student.java
public class Student {
    private String name; // 이름 속성
    private int age; // 나이 속성

    // 생성자
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 학생 정보를 출력하는 메소드
    public void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}
