package bitmainupluation;

import java.util.*;
//clear bit mainpulation makes the 1 bit to 0 bit in change.

public class clearbit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), pos = sc.nextInt(), bitmask = 1 << pos;
            int notbitmask = ~(bitmask);
            int newnumber = notbitmask & n;
        System.out.println(newnumber);
        }
    }
}
