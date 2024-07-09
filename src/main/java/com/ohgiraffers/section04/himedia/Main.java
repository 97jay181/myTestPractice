package com.ohgiraffers.section04.himedia;

import com.ohgiraffers.section04.himedia.StudentController;

public class Main {
    public static void main(String[] args) {
        // 학생 관리 프로그램의 컨트롤러 생성 및 시작
        StudentController controller = new StudentController();
        controller.start();         // 프로그램 시작 메소드 호출
    }
}