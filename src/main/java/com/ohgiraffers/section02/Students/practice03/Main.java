package com.ohgiraffers.section02.Students.practice03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Student> students;
    private Scanner scanner;

    // 생성자
    public Main() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // 학생 정보 입력
    public void addStudent() {
        System.out.print("학생 이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("국어 점수를 입력하세요: ");
        int koreanScore = scanner.nextInt();
        System.out.print("영어 점수를 입력하세요: ");
        int englishScore = scanner.nextInt();
        System.out.print("수학 점수를 입력하세요: ");
        int mathScore = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 문자 소비

        students.add(new Student(name, koreanScore, englishScore, mathScore));
        System.out.println("학생이 성공적으로 추가되었습니다.");


    }

    // 전체 학생 정보 출력
    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
        } else {
            for (Student student : students) {
                printStudentInfo(student);
            }
        }
    }

    // 특정 학생 정보 출력
    public void printStudent() {
        System.out.print("검색할 학생 이름을 입력하세요: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                printStudentInfo(student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 학생을 찾을 수 없습니다.");
        }
    }

    // 학생 정보 출력 (헬퍼 메소드)
    private void printStudentInfo(Student student) {
        System.out.println("이름: " + student.getName());
        System.out.println("국어 점수: " + student.getKoreanScore());
        System.out.println("영어 점수: " + student.getEnglishScore());
        System.out.println("수학 점수: " + student.getMathScore());
        System.out.println("-----------------------------");
    }

    // 학생 정보 수정
    public void updateStudent() {
        System.out.print("수정할 학생 이름을 입력하세요: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.print("새로운 국어 점수를 입력하세요: ");
                int koreanScore = scanner.nextInt();
                System.out.print("새로운 영어 점수를 입력하세요: ");
                int englishScore = scanner.nextInt();
                System.out.print("새로운 수학 점수를 입력하세요: ");
                int mathScore = scanner.nextInt();
                scanner.nextLine(); // 줄바꿈 문자 소비

                student.setKoreanScore(koreanScore);
                student.setEnglishScore(englishScore);
                student.setMathScore(mathScore);
                System.out.println("학생 정보가 성공적으로 수정되었습니다.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 학생을 찾을 수 없습니다.");
        }
    }

    // 학생 정보 삭제
    public void deleteStudent() {
        System.out.print("삭제할 학생 이름을 입력하세요: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                students.remove(student);
                System.out.println("학생이 성공적으로 삭제되었습니다.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 학생을 찾을 수 없습니다.");
        }
    }

    // 메인 메소드
    public static void main(String[] args) {
        Main manager = new Main();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. 학생 추가");
            System.out.println("2. 모든 학생 출력");
            System.out.println("3. 특정 학생 검색");
            System.out.println("4. 학생 정보 수정");
            System.out.println("5. 학생 삭제");
            System.out.println("6. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // 줄바꿈 문자 소비

            switch (option) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.printAllStudents();
                    break;
                case 3:
                    manager.printStudent();
                    break;
                case 4:
                    manager.updateStudent();
                    break;
                case 5:
                    manager.deleteStudent();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
    }
}