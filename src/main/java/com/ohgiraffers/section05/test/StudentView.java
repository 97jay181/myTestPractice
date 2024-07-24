package com.ohgiraffers.section05.test;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private Scanner sc;

    // 뷰 객체를 만들 때 사용하는 생성자 메서드
    public StudentView() {
        this.sc = new Scanner(System.in);  // 입력을 받기 위해 스캐너 객체 만들기
    }

    // 메뉴를 보여주고 사용자의 선택을 받는 메서드
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
        return sc.nextInt();  // 사용자의 선택을 숫자 반환
    }

    // 학생의 정보를 입력받는 메서드
    public Student readStudentInfo() {
        sc.nextLine();  // 버퍼를 비웁니다.
        System.out.print("이름: ");
        String name = sc.nextLine();  // 이름을 입력받기
        int koreanScore = readScore("국어 점수: ");  // 국어 점수를 입력받기
        int englishScore = readScore("영어 점수: ");  // 영어 점수를 입력받기.
        int mathScore = readScore("수학 점수: ");  // 수학 점수를 입력받기.
        return new Student(name, koreanScore, englishScore, mathScore);  // 입력받은 정보로 학생 객체를 만들어 반환.
    }

    // 점수를 입력받는 메서드
    int readScore(String message) {
        int score;
        do {
            System.out.print(message);  // 어떤 점수를 입력할지 물어봄
            score = sc.nextInt();  // 점수를 숫자로 입력받기
            if (score < 0 || score > 100) {  // 점수가 0에서 100 사이가 아니면
                System.out.println("점수는 0에서 100 사이여야 합니다. 다시 입력하세요.");  // 잘못된 점수라고 알려줌
            }
        } while (score < 0 || score > 100);  // 올바른 점수가 입력될 때까지 반복
        return score;  // 올바른 점수를 반환
    }

    // 문자열을 입력받는 메서드
    public String readStringInput(String message) {
        sc.nextLine();
        System.out.print(message);
        return sc.nextLine();  // 문자열을 입력받아 돌려줍니다.
    }

    // 모든 학생 정보를 출력하는 메서드
    public void printAllStudents(List<Student> students) {
        if (students.isEmpty()) {  // 학생 목록이 비어 있으면
            System.out.println("등록된 학생이 없습니다.");  // 학생이 없다고 알려주는 출력문
        } else {  // 학생 목록이 비어 있지 않으면
            for (Student student : students) {  // 모든 학생을 차례로
                System.out.println(student);  // 학생의 정보를 출력
            }
        }
    }

    // 특정 학생의 정보를 출력하는 메서드
    public void printStudentDetails(Student student) {
        System.out.println(student);  // 학생의 정보를 출력
    }

    // 평균 점수를 출력하는 메서드
    public void printAverageScore(Student student, double average) {
        System.out.println(student.getName() + "의 평균 점수: " + average);  // 학생의 평균 점수를 출력
    }

    // 학생의 등수를 출력하는 메서드
    public void printStudentRank(int rank, Student student) {
        System.out.println(rank + "등: " + student.getName() + " -> 총점: " + student.getTotalScore());  // 학생의 등수를 출력
    }

    // 메시지를 출력하는 메서드
    public void printMessage(String message) {
        System.out.println(message);  // 메시지를 출력
    }
}