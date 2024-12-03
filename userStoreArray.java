import java.util.*;

public class userStoreArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int nums[] = new int[size];
            // input size:+numbers that are store in index numbers .c
            for (int i = 0; i < size; i++) {
                nums[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            // if we want size of any array Simply used .length with any name as name.length
            // it takes size of any array, size=length
            // output:
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]== x) {
                    System.out.println("X found on index: " + i);
                }
                System.out.println(nums[i]);
            }
        }
    }
}
