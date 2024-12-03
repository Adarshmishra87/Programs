import java.util.*;

public class findX {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int rows = sc.nextInt();
            int col = sc.nextInt();
            int[][] name = new int[rows][col];
            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < col; j++) {
                    name[i][j] = sc.nextInt();
                }

            }

            int x = sc.nextInt();

            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < col; j++) {

                    if (name[i][j] == x) {
                        System.out.println("x is found in index(" + i + ", " + j + ")");
                    }
                }
            }

        }
    }
}
 