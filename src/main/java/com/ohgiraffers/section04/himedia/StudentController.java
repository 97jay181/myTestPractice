package com.ohgiraffers.section04.himedia;

import com.ohgiraffers.section04.himedia.Student;
import com.ohgiraffers.section04.himedia.StudentView;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentController {
    private List<Student> students;
    private StudentView view;

    public StudentController() {
        this.students = new ArrayList<>();
        this.view = new StudentView();
    }

    public void start() {
        while (true) {
            int choice = view.printMenuAndGetChoice();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    displayStudent();
                    break;
                case 4:
                    modifyStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    displayAverageScores();
                    break;
                case 7:
                    displayStudentRanks();
                    break;
                case 8:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }

    private void addStudent() {
        Student student = view.readStudentInfo();
        students.add(student);
        System.out.println("학생 정보가 추가되었습니다.");
    }

    private void displayAllStudents() {
        view.printAllStudents(students);
    }

    private void displayStudent() {
        String name = view.readStringInput("검색할 학생의 이름: ");
        Student student = findStudentByName(name);

        if (student != null) {
            view.printStudentDetails(student);
        } else {
            view.printMessage("해당 이름의 학생이 없습니다.");
        }
    }

    private void modifyStudent() {
        String name = view.readStringInput("수정할 학생의 이름: ");
        Student student = findStudentByName(name);

        if (student != null) {
            String newName = view.readStringInput("새 이름: ");
            int koreanScore = view.readScore("새 국어 점수: ");
            int englishScore = view.readScore("새 영어 점수: ");
            int mathScore = view.readScore("새 수학 점수: ");

            student.setName(newName);
            student.setKoreanScore(koreanScore);
            student.setEnglishScore(englishScore);
            student.setMathScore(mathScore);

            view.printMessage("학생 정보가 수정되었습니다.");
        } else {
            view.printMessage("해당 이름의 학생이 없습니다.");
        }
    }

    private void deleteStudent() {
        String name = view.readStringInput("삭제할 학생의 이름: ");
        Student student = findStudentByName(name);

        if (student != null) {
            students.remove(student);
            view.printMessage("학생 정보가 삭제되었습니다.");
        } else {
            view.printMessage("해당 이름의 학생이 없습니다.");
        }
    }

    private Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    private void displayAverageScores() {
        for (Student student : students) {
            double average = (student.getKoreanScore() + student.getEnglishScore() + student.getMathScore()) / 3.0;
            view.printAverageScore(student, average);
        }
    }

    private void displayStudentRanks() {
        students.sort(Comparator.comparingInt(Student::getTotalScore).reversed());

        for (int i = 0; i < students.size(); i++) {
            view.printStudentRank(i + 1, students.get(i));
        }
    }
}