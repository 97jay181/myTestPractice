package com.ohgiraffers.section05.test;

public class Student {
    private String name;  // 학생의 이름을 저장하는 변수
    private int koreanScore;  // 학생의 국어 점수를 저장하는 변수
    private int englishScore;  // 학생의 영어 점수를 저장하는 변수
    private int mathScore;  // 학생의 수학 점수를 저장하는 변수

    // 학생 객체를 만들 때 사용하는 생성자 메서드
    public Student(String name, int koreanScore, int englishScore, int mathScore) {
        this.name = name;  // 입력받은 이름을 저장
        this.koreanScore = koreanScore;  // 입력받은 국어 점수를 저장
        this.englishScore = englishScore;  // 입력받은 영어 점수를 저장
        this.mathScore = mathScore;  // 입력받은 수학 점수를 저장
    }

    // 학생의 이름을 돌려주는 메서드
    public String getName() {
        return name;
    }

    // 학생의 국어 점수를 돌려주는 메서드
    public int getKoreanScore() {
        return koreanScore;
    }

    // 학생의 영어 점수를 돌려주는 메서드
    public int getEnglishScore() {
        return englishScore;
    }

    // 학생의 수학 점수를 돌려주는 메서드
    public int getMathScore() {
        return mathScore;
    }

    // 학생의 이름을 바꾸는 메서드
    public void setName(String name) {
        this.name = name;
    }

    // 학생의 국어 점수를 바꾸는 메서드
    public void setKoreanScore(int koreanScore) {
        this.koreanScore = koreanScore;
    }

    // 학생의 영어 점수를 바꾸는 메서드
    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    // 학생의 수학 점수를 바꾸는 메서드
    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    // 학생의 총 점수를 돌려주는 메서드
    public int getTotalScore() {
        return koreanScore + englishScore + mathScore;
    }

    // 학생의 정보를 보기 좋게 문자열로 돌려주는 메서드
    @Override
    public String toString() {
        return "이름: " + name + ", 국어 점수: " + koreanScore + ", 영어 점수: " + englishScore + ", 수학 점수: " + mathScore;
    }
}