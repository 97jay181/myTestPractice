package section03.July.first.Normal;

import java.util.Scanner;

public class Normal04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 월 입력 받기
        System.out.print("월을 입력하세요 (1~12월): ");
        int month = sc.nextInt();

        // 입력받은 월에 따라 계절 판별
        String season;
        switch (month) {
            case 3: case 4: case 5:
                season = "봄";
                break;
            case 6: case 7: case 8:
                season = "여름";
                break;
            case 9: case 10: case 11:
                season = "가을";
                break;
            case 12: case 1: case 2:
                season = "겨울";
                break;
            default:
                season = "잘못된 월을 입력하셨습니다.";
                break;
        }

        // 결과 출력
        System.out.println(month + "월은 " + season + "입니다.");

        sc.close();
    }
}
