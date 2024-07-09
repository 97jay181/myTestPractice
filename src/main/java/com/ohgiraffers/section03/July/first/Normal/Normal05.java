package section03.July.first.Normal;

public class Normal05 {

    public static void main(String[] args) {

        /* 2x3 형태의 2차원 배열을 선언하고 초기화한 후, 배열의 모든 요소를 출력하는 프로그램을 작성하세요. */

        // 2x3 형태의 2차원 배열 선언 및 초기화
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        // 배열의 모든 요소 출력
        System.out.println("배열의 요소들:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

                if (j < matrix[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(); // 다음 행을 출력하기 위한 줄 바꿈
        }
    }
}
