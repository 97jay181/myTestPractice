package com.ohgiraffers.section02.Students.practice02;

public class Student {
    private String name;    // 학생 이름
    private int korean;     // 국어 점수
    private int english;    // 영어 점수
    private int math;       // 수학 점수

    // 생성자: 이름과 점수를 매개변수로 받아서 초기화
    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    // Getter 메소드: 각 필드 값을 반환
    public String getName() {
        return name;
    }

    public int getKorean() {
        return korean;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    // Setter 메소드: 각 필드 값을 설정
    public void setKorean(int korean) {
        this.korean = korean;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setMath(int math) {
        this.math = math;
    }

    // 학생 정보를 문자열로 반환
    @Override
    public String toString() {
        return "이름: " + name + ", 국어: " + korean + ", 영어: " + english + ", 수학: " + math;
    }

    // 세 과목 점수를 합산하여 총점을 반환하는 메소드
    public int getTotalScore() {
        return korean + english + math;
    }
}