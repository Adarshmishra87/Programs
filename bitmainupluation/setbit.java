package bitmainupluation;

import java.util.*;

public class setbit {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), pos = sc.nextInt(), bitmask = 1 << pos;
            int newnumber = bitmask | n;
            System.out.println("after changing zero bit to one it gives us new number: " + newnumber);
        }
    }
}
