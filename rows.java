import java.util.*;

public class rows {
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

            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < col; j++) {
                    System.out.print(name [i] [j] + " ");
                }
                System.out.println();
            }

        }
    }
}
