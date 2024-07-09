package com.ohgiraffers.section04.himedia;

import com.ohgiraffers.section04.himedia.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private Scanner scanner;

    public StudentView() {
        this.scanner = new Scanner(System.in);
    }

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
        return scanner.nextInt();
    }

    public Student readStudentInfo() {
        scanner.nextLine(); // 버퍼 비우기
        System.out.print("이름: ");
        String name = scanner.nextLine();
        int koreanScore = readScore("국어 점수: ");
        int englishScore = readScore("영어 점수: ");
        int mathScore = readScore("수학 점수: ");
        return new Student(name, koreanScore, englishScore, mathScore);
    }

    int readScore(String message) {
        int score;
        do {
            System.out.print(message);
            score = scanner.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("점수는 0에서 100 사이여야 합니다. 다시 입력하세요.");
            }
        } while (score < 0 || score > 100);
        return score;
    }

    public String readStringInput(String message) {
        scanner.nextLine(); // 버퍼 비우기
        System.out.print(message);
        return scanner.nextLine();
    }

    public void printAllStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void printStudentDetails(Student student) {
        System.out.println(student);
    }

    public void printAverageScore(Student student, double average) {
        System.out.println(student.getName() + "의 평균 점수: " + average);
    }

    public void printStudentRank(int rank, Student student) {
        System.out.println(rank + "등: " + student.getName() + " -> 총점: " + student.getTotalScore());
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}