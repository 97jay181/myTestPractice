package com.ohgiraffers.section04.himedia;

import com.ohgiraffers.section04.himedia.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private Scanner sc;

    // 생성자
    public StudentView() {
        this.sc = new Scanner(System.in); // 입력을 위한 스캐너 초기화
    }

    // 메뉴 출력 및 선택 메소드
    public int printMenuAndGetChoice() {
        System.out.println("=========== 메뉴 대령이오 ===========================");
        System.out.println("1. 학생 정보 입력");
        System.out.println("2. 전체 학생 정보 출력");
        System.out.println("3. 특정 학생 정보 출력");
        System.out.println("4. 학생 정보 수정");
        System.out.println("5. 학생 정보 삭제");
        System.out.println("6. 학생 평균 점수 출력");
        System.out.println("7. 학생 등수 출력");
        System.out.println("8. 종료");
        System.out.println("===============================================");
        System.out.print("★ 메뉴를 선택하장~: ");
        return sc.nextInt();
    }

    // 학생 정보 입력 메소드
    public Student readStudentInfo() {
        sc.nextLine(); // 버퍼 비우기
        System.out.print("이름: ");
        String name = sc.nextLine();
        int koreanScore = readScore("국어 점수: ");
        int englishScore = readScore("영어 점수: ");
        int mathScore = readScore("수학 점수: ");
        return new Student(name, koreanScore, englishScore, mathScore);
    }

    // 점수 입력 유틸리티 메소드
    int readScore(String message) {
        int score;
        do {
            System.out.print(message);
            score = sc.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("점수는 0에서 100 사이여야 합니다. 다시 입력하세요.");
            }
        } while (score < 0 || score > 100);
        return score;
    }

    // 문자열 입력 메소드
    public String readStringInput(String message) {
        sc.nextLine(); // 버퍼 비우기
        System.out.print(message);
        return sc.nextLine();
    }

    // 전체 학생 정보 출력 메소드
    public void printAllStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // 특정 학생 정보 출력 메소드
    public void printStudentDetails(Student student) {
        System.out.println(student);
    }

    // 평균 점수 출력 메소드
    public void printAverageScore(Student student, double average) {
        System.out.println(student.getName() + "의 평균 점수: " + average);
    }

    // 학생 등수 출력 메소드
    public void printStudentRank(int rank, Student student) {
        System.out.println(rank + "등: " + student.getName() + " -> 총점: " + student.getTotalScore());
    }

    // 메시지 출력 메소드
    public void printMessage(String message) {
        System.out.println(message);
    }
}