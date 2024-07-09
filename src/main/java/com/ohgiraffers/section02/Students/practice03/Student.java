package com.ohgiraffers.section02.Students.practice03;

//학생 정보 입력 기능 : 사용자로부터 학생의 이름과 성적(국어, 영어, 수학)을 입력 받아 배열에 추가
//전체 학생 정보 출력 기능 : 전체 학생이 이름과 성적(국어, 영어, 수학)을 출력
//특정 학생 정보 출력 기능 : 검색한 학생의 이름과 성적(국어, 영어, 수학)을 출력
//
//        추가적으로 수정, 삭제 등을 추가할 수 있으면 해주셔도 상관없습니다.
//
//        (단, 이름이 없는 경우 없다는 표기를 해야 함)
//
//이 과제를 해결하기 위해서 꼭 Class를 사용하였으면 합니다.

public class Student {
    private String name;
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    // 기본 생성자
    public Student() {}

    // 매개변수가 있는 생성자
    public Student(String name, int koreanScore, int englishScore, int mathScore) {
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public void setKoreanScore(int koreanScore) {
        this.koreanScore = koreanScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }
}