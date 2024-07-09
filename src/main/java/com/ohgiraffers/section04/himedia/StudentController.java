package com.ohgiraffers.section04.himedia;

import com.ohgiraffers.section04.himedia.Student;
import com.ohgiraffers.section04.himedia.StudentView;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentController {
    private List<Student> students;
    private StudentView view;

    // 생성자
    public StudentController() {
        this.students = new ArrayList<>(); // 학생 목록 초기화
        this.view = new StudentView(); // 뷰 초기화
    }

    // 프로그램 시작 메소드
    public void start() {
        while (true) {
            int choice = view.printMenuAndGetChoice(); // 메뉴 출력 및 선택

            switch (choice) {
                case 1:
                    addStudent(); // 학생 추가 메소드 호출
                    break;
                case 2:
                    displayAllStudents(); // 모든 학생 정보 출력 메소드 호출
                    break;
                case 3:
                    displayStudent(); // 특정 학생 정보 출력 메소드 호출
                    break;
                case 4:
                    modifyStudent(); // 학생 정보 수정 메소드 호출
                    break;
                case 5:
                    deleteStudent(); // 학생 정보 삭제 메소드 호출
                    break;
                case 6:
                    displayAverageScores(); // 평균 점수 출력 메소드 호출
                    break;
                case 7:
                    displayStudentRanks(); // 학생 등수 출력 메소드 호출
                    break;
                case 8:
                    System.out.println("프로그램을 종료합니다."); // 프로그램 종료 메시지 출력
                    return; // 메소드 종료
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요."); // 잘못된 입력 메시지 출력
            }
        }
    }

    // 학생 추가 메소드
    private void addStudent() {
        Student student = view.readStudentInfo(); // 뷰를 통해 학생 정보 입력 받기
        students.add(student); // 학생 목록에 추가
        System.out.println("학생 정보가 추가되었습니다."); // 추가 완료 메시지 출력
    }

    // 모든 학생 정보 출력 메소드
    private void displayAllStudents() {
        view.printAllStudents(students); // 뷰를 통해 모든 학생 정보 출력
    }

    // 특정 학생 정보 출력 메소드
    private void displayStudent() {
        String name = view.readStringInput("검색할 학생의 이름: "); // 검색할 학생 이름 입력 받기
        Student student = findStudentByName(name); // 이름으로 학생 검색

        if (student != null) {
            view.printStudentDetails(student); // 학생 정보 출력
        } else {
            System.out.println("해당 이름의 학생이 없습니다."); // 학생이 없을 경우 메시지 출력
        }
    }

    // 학생 정보 수정 메소드
    private void modifyStudent() {
        String name = view.readStringInput("수정할 학생의 이름: "); // 수정할 학생 이름 입력 받기
        Student student = findStudentByName(name); // 이름으로 학생 검색

        if (student != null) {
            String newName = view.readStringInput("새 이름: ");        // 새 이름 입력 받기
            int koreanScore = view.readScore("새 국어 점수: ");        // 새 국어 점수 입력 받기
            int englishScore = view.readScore("새 영어 점수: ");       // 새 영어 점수 입력 받기
            int mathScore = view.readScore("새 수학 점수: ");          // 새 수학 점수 입력 받기

            // 입력 받은 정보로 학생 정보 수정
            student.setName(newName);
            student.setKoreanScore(koreanScore);
            student.setEnglishScore(englishScore);
            student.setMathScore(mathScore);

            System.out.println("학생 정보가 수정되었습니다."); // 수정 완료 메시지 출력
        } else {
            System.out.println("해당 이름의 학생이 없습니다."); // 학생이 없을 경우 메시지 출력
        }
    }

    // 학생 정보 삭제 메소드
    private void deleteStudent() {
        String name = view.readStringInput("삭제할 학생의 이름: ");     // 삭제할 학생 이름 입력 받기
        Student student = findStudentByName(name);                      // 이름으로 학생 검색

        if (student != null) {
            students.remove(student); // 학생 목록에서 삭제
            System.out.println("학생 정보가 삭제되었습니다."); // 삭제 완료 메시지 출력
        } else {
            System.out.println("해당 이름의 학생이 없습니다."); // 학생이 없을 경우 메시지 출력
        }
    }

    // 이름으로 학생 검색 메소드
    private Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student; // 이름이 일치하는 학생 반환
            }
        }
        return null; // 일치하는 학생이 없을 경우 null 반환
    }

    // 모든 학생의 평균 점수 출력 메소드
    private void displayAverageScores() {
        for (Student student : students) {
            double average = (student.getKoreanScore() + student.getEnglishScore() + student.getMathScore()) / 3.0; // 평균 계산
            view.printAverageScore(student, average); // 평균 점수 출력
        }
    }

    // 학생 등수 출력 메소드
    private void displayStudentRanks() {
        students.sort(Comparator.comparingInt(Student::getTotalScore).reversed()); // 학생들을 총점 역순으로 정렬

        for (int i = 0; i < students.size(); i++) {
            view.printStudentRank(i + 1, students.get(i)); // 등수 출력
        }
    }
}