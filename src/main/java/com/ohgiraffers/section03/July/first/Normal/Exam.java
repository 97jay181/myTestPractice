package section03.July.first.Normal;

import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {

        //사용자로부터 세 정수를 입력받아 모두 양수인 경우에만 "모두 양수입니다."를 출력하는 프로그램을 작성하세요.
        //https://docs.oracle.com/javase%2F8%2Fdocs%2Fapi%2F%2F/java/lang/Math.html
        Scanner sc = new Scanner(System.in);
        int A = Integer.signum(sc.nextInt());
        int B = Integer.signum(sc.nextInt());
        int C = Integer.signum(sc.nextInt());

        if(A == 1 && B == 1 && C == 1){
            System.out.println("모두 양수입니다.");
        }
        else {
            System.out.println("잘못입력했습니다.");
        }
    }
}
