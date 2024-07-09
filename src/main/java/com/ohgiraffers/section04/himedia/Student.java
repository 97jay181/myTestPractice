package com.ohgiraffers.section04.himedia;

public class Student {
    private String name;
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    // 학생 생성자
    public Student(String name, int koreanScore, int englishScore, int mathScore) {
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    // Getter 및 Setter 메소드들
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

    // 총점 계산 메소드
    public int getTotalScore() {
        return koreanScore + englishScore + mathScore;
    }

    // 학생 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "이름: " + name + ", 국어: " + koreanScore + ", 영어: " + englishScore + ", 수학: " + mathScore;
    }
}