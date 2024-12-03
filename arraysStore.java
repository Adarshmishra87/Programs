import java.util.*;

public class arraysStore {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int nums[] = new int[size];
            // input size:+numbers that are store in index numbers .c
            for (int i = 0; i < size; i++) {
                nums[i] = sc.nextInt();
            }
            // output:
            for (int i = 0; i < size; i++) {

                System.out.println(nums[i]);
            }
        }
    }
}