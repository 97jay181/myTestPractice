package com.ohgiraffers.section05.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentController {
    private List<Student> students;
    private StudentView view;

    // 컨트롤러 객체를 만들 때 사용하는 생성자 메서드
    public StudentController() {
        this.students = new ArrayList<>();  // 학생 목록을 초기화.
        this.view = new StudentView();      // 뷰 객체를 만듦.
    }

    // 프로그램을 시작하는 메서드
    public void start() {
        while (true) {                                  // 프로그램이 종료될 때까지 반복.
            int choice = view.printMenuAndGetChoice();  // 메뉴를 보여주고 사용자의 선택을 받음.

            switch (choice) {                           // 사용자의 선택에 따름
                case 1:
                    addStudent();                       // 학생정보 추가
                    break;
                case 2:
                    displayAllStudents();               // 모든 학생 정보를 출력.
                    break;
                case 3:
                    displayStudent();                   // 특정 학생 정보를 출력합니다.
                    break;
                case 4:
                    modifyStudent();                    // 학생 정보를 수정합니다.
                    break;
                case 5:
                    deleteStudent();  // 학생 정보를 삭제합니다.
                    break;
                case 6:
                    displayAverageScores();  // 평균 점수를 출력합니다.
                    break;
                case 7:
                    displayStudentRanks();  // 학생의 등수를 출력합니다.
                    break;
                case 8:
                    System.out.println("프로그램을 종료합니다.");  // 프로그램을 종료합니다.
                    return;  // 메서드를 종료합니다.
                default:
                    System.out.println("잘못된 입력입니다.다시 선택하세요.");  // 잘못된 입력이라고 알려줍니다.
            }
        }
    }

    // 학생을 추가하는 메서드
    private void addStudent() {
        Student student = view.readStudentInfo();  // 학생의 정보를 입력받습니다.
        students.add(student);  // 학생 목록에 추가합니다.
        view.printMessage("학생 정보가 추가되었습니다.");  // 학생이 추가되었다고 알려줍니다.
    }

    // 모든 학생 정보를 출력하는 메서드
    private void displayAllStudents() {
        view.printAllStudents(students);  // 모든 학생 정보를 출력합니다.
    }

    // 특정 학생 정보를 출력하는 메서드
    private void displayStudent() {
        String name = view.readStringInput("학생 이름을 입력하세요: ");  // 이름을 입력받습니다.
        Student student = findStudentByName(name);  // 이름으로 학생을 찾습니다.
        if (student != null) {  // 학생이 있으면
            view.printStudentDetails(student);  // 학생 정보를 출력합니다.
        } else {  // 학생이 없으면
            view.printMessage("해당 이름의 학생이 없습니다.");  // 학생이 없다고 알려줍니다.
        }
    }

    // 학생 정보를 수정하는 메서드
    private void modifyStudent() {
        String name = view.readStringInput("수정할 학생 이름을 입력하세요: ");  // 이름을 입력받습니다.
        Student student = findStudentByName(name);  // 이름으로 학생을 찾습니다.
        if (student != null) {  // 학생이 있으면
            Student updatedStudent = view.readStudentInfo();  // 새 정보를 입력받습니다.
            student.setName(updatedStudent.getName());  // 이름을 바꿉니다.
            student.setKoreanScore(updatedStudent.getKoreanScore());  // 국어 점수를 바꿉니다.
            student.setEnglishScore(updatedStudent.getEnglishScore());  // 영어 점수를 바꿉니다.
            student.setMathScore(updatedStudent.getMathScore());  // 수학 점수를 바꿉니다.
            view.printMessage("학생 정보가 수정되었습니다.");  // 수정되었다고 알려줍니다.
        } else {  // 학생이 없으면
            view.printMessage("해당 이름의 학생이 없습니다.");  // 학생이 없다고 알려줍니다.
        }
    }

    // 학생 정보를 삭제하는 메서드
    private void deleteStudent() {
        String name = view.readStringInput("삭제할 학생 이름을 입력하세요: ");  // 이름을 입력받습니다.
        Student student = findStudentByName(name);  // 이름으로 학생을 찾습니다.
        if (student != null) {  // 학생이 있으면
            students.remove(student);  // 학생 목록에서 삭제합니다.
            view.printMessage("학생 정보가 삭제되었습니다.");  // 삭제되었다고 알려줍니다.
        } else {  // 학생이 없으면
            view.printMessage("해당 이름의 학생이 없습니다.");  // 학생이 없다고 알려줍니다.
        }
    }

    // 학생의 평균 점수를 출력하는 메서드
    private void displayAverageScores() {
        for (Student student : students) {  // 모든 학생에 대해
            double average = student.getTotalScore() / 3.0;  // 평균 점수를 계산합니다.
            view.printAverageScore(student, average);  // 평균 점수를 출력합니다.
        }
    }

    // 학생의 등수를 출력하는 메서드
    private void displayStudentRanks() {
        students.sort(Comparator.comparingInt(Student::getTotalScore).reversed());  // 점수에 따라 학생을 정렬합니다.
        for (int i = 0; i < students.size(); i++) {  // 모든 학생에 대해
            view.printStudentRank(i + 1, students.get(i));  // 등수를 출력합니다.
        }
    }

    // 이름으로 학생을 찾는 메서드
    private Student findStudentByName(String name) {
        for (Student student : students) {  // 모든 학생을 차례로
            if (student.getName().equals(name)) {  // 이름이 같으면
                return student;  // 학생을 돌려줍니다.
            }
        }
        return null;  // 학생이 없으면 null을 돌려줍니다.
    }
}

