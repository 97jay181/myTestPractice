package com.ohgiraffers.section02.Students.practice02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    // 학생 정보를 저장하는 ArrayList와 사용자 입력을 받는 Scanner 객체 선언
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) { // 무한 루프를 통해 메뉴를 반복 출력
            System.out.println("1. 학생 정보 입력");
            System.out.println("2. 전체 학생 정보 출력");
            System.out.println("3. 특정 학생 정보 출력");
            System.out.println("4. 학생 정보 수정");
            System.out.println("5. 학생 정보 삭제");
            System.out.println("6. 학생 평균 점수 출력");
            System.out.println("7. 학생 등수 출력");
            System.out.println("8. 종료");
            System.out.println("===============================================");
            System.out.print("메뉴를 선택하세요: ");

            int choice = sc.nextInt(); // 사용자로부터 메뉴 선택 입력 받음
            sc.nextLine();  // 개행 문자를 소비하여 입력 버퍼를 비움

            switch (choice) { // 사용자가 입력한 메뉴에 따라 다른 메소드 호출
                case 1:
                    addStudent(); // 학생 정보 입력
                    break;
                case 2:
                    displayAllStudents(); // 전체 학생 정보 출력
                    break;
                case 3:
                    displayStudent(); // 특정 학생 정보 출력
                    break;
                case 4:
                    modifyStudent(); // 학생 정보 수정
                    break;
                case 5:
                    deleteStudent(); // 학생 정보 삭제
                    break;
                case 6:
                    displayAverageScores(); // 학생 평균 점수 출력
                    break;
                case 7:
                    displayStudentRanks(); // 학생 등수 출력
                    break;
                case 8:
                    System.out.println("프로그램을 종료합니다."); // 프로그램 종료 메시지 출력 후 루프 종료
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요."); // 잘못된 입력 처리
            }
        }
    }

    // 학생 정보를 입력받아 ArrayList에 추가하는 메소드
    private static void addStudent() {
        System.out.print("이름: ");
        String name = sc.nextLine();
        int korean = getValidatedScore("국어 점수");
        int english = getValidatedScore("영어 점수");
        int math = getValidatedScore("수학 점수");

        // 입력받은 정보를 기반으로 새로운 학생 객체를 생성하고 리스트에 추가
        students.add(new Student(name, korean, english, math));
        System.out.println("학생 정보가 추가되었습니다.");
    }

    // 유효한 점수를 입력받는 메소드
    private static int getValidatedScore(String subject) {
        int score;
        while (true) {
            System.out.print(subject + ": ");
            score = sc.nextInt();
            sc.nextLine();  // 개행 문자를 소비하여 입력 버퍼를 비움
            if (score >= 0 && score <= 100) {
                break;
            } else {
                System.out.println("점수는 0에서 100 사이여야 합니다. 다시 입력하세요.");
            }
        }
        return score;
    }

    // 모든 학생 정보를 출력하는 메소드
    private static void displayAllStudents() {
        if (students.isEmpty()) { // 리스트가 비어있는 경우
            System.out.println("등록된 학생이 없습니다.");
        } else { // 리스트에 학생 정보가 있는 경우
            for (Student student : students) { // 모든 학생 정보를 출력
                System.out.println(student);
            }
        }
    }

    // 특정 학생의 정보를 이름으로 검색하여 출력하는 메소드
    private static void displayStudent() {
        System.out.print("검색할 학생의 이름: ");
        String name = sc.nextLine();
        Student student = findStudentByName(name); // 이름으로 학생 검색

        if (student != null) { // 학생이 존재하는 경우
            System.out.println(student); // 학생 정보 출력
        } else { // 학생이 존재하지 않는 경우
            System.out.println("해당 이름의 학생이 없습니다.");
        }
    }

    // 특정 학생의 정보를 수정하는 메소드
    private static void modifyStudent() {
        System.out.print("수정할 학생의 이름: ");
        String name = sc.nextLine();
        Student student = findStudentByName(name); // 이름으로 학생 검색

        if (student != null) { // 학생이 존재하는 경우
            int korean = getValidatedScore("새 국어 점수");
            int english = getValidatedScore("새 영어 점수");
            int math = getValidatedScore("새 수학 점수");

            // 입력받은 새 점수로 학생 정보 수정
            student.setKorean(korean);
            student.setEnglish(english);
            student.setMath(math);

            System.out.println("학생 정보가 수정되었습니다.");
        } else { // 학생이 존재하지 않는 경우
            System.out.println("해당 이름의 학생이 없습니다.");
        }
    }

    // 특정 학생의 정보를 삭제하는 메소드
    private static void deleteStudent() {
        System.out.print("삭제할 학생의 이름: ");
        String name = sc.nextLine();
        Student student = findStudentByName(name); // 이름으로 학생 검색

        if (student != null) { // 학생이 존재하는 경우
            students.remove(student); // 리스트에서 학생 정보 삭제
            System.out.println("학생 정보가 삭제되었습니다.");
        } else { // 학생이 존재하지 않는 경우
            System.out.println("해당 이름의 학생이 없습니다.");
        }
    }

    // 이름으로 학생을 검색하는 메소드
    private static Student findStudentByName(String name) {
        for (Student student : students) { // 리스트에서 모든 학생 검색
            if (student.getName().equalsIgnoreCase(name)) { // 이름이 일치하는 경우
                return student; // 해당 학생 반환
            }
        }
        return null; // 해당 학생이 없는 경우 null 반환
    }

    // 모든 학생의 평균 점수를 출력하는 메소드
    private static void displayAverageScores() {
        for (Student student : students) { // 리스트에서 모든 학생 검색
            double average = (student.getKorean() + student.getEnglish() + student.getMath()) / 3.0; // 평균 점수 계산
            System.out.println(student.getName() + "의 평균 점수: " + average); // 평균 점수 출력
        }
    }

    // 학생들의 등수를 계산하고 출력하는 메소드
    private static void displayStudentRanks() {
        // 학생들을 총점 기준으로 내림차순 정렬
        students.sort(Comparator.comparingInt(Student::getTotalScore).reversed());

        for (int i = 0; i < students.size(); i++) { // 정렬된 학생 리스트 출력
            System.out.println((i + 1) + "등: " + students.get(i).getName() + " - 총점: " + students.get(i).getTotalScore());
        }
    }
}