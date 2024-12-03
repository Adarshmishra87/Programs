package bitmainupluation;

import java.util.*;

//getbit code shows that what value is on 0,1,2,3 bit positions.
public class getbit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), pos = sc.nextInt(), bitmask = 1 << pos;
            if ((bitmask & n) == 0) {
                System.out.println("bitmask is zero");  
            } else {
                System.out.println("bitmask is one");
            }
        }
    }
}
