package com.ohgiraffers.section03.July.first.Hard;

// Main.java
public class Main {
    public static void main(String[] args) {

        /**
         * 학생(Student) 클래스를 정의하고, 이름(name)과 나이(age) 속성을 갖도록 하세요.
         * 또한, 학생 정보를 출력하는 메소드 printInfo()를 작성하고, 여러 명의 학생 객체를 생성하여 정보를 출력하는 프로그램을 작성하세요.
         */

        // 여러 명의 학생 객체 생성
        section03.July.first.Hard.Student student1 = new Student("준식", 28);
        Student student2 = new Student("채영", 27);
        Student student3 = new Student("관응", 22);
        Student student4 = new Student("성균", 28);

        // 학생 정보를 출력
        System.out.println("\n여러명의 학생 객체 생성 : ");
        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
        student4.printInfo();

        // 배열을 사용하여 학생 객체 생성 및 정보 출력
        Student[] students = {
                new Student("아이유", 22),
                new Student("수지", 20),
                new Student("지효", 23),
                new Student("사나", 21)
        };

        System.out.println("\n배열을 이용한 학생 정보 출력:");
        for (Student student : students) {
            student.printInfo();
        }
    }
}
