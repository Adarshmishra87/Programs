package bitmainupluation;

import java.util.Scanner;

public class updatebit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), pos = sc.nextInt(), bitmask = 1 << pos;
            int operation = sc.nextInt();
            if (operation == 1) {
                //set
                int newnumber = bitmask | n;
                System.out.println("after changing zero bit to one it gives us new number: " + newnumber);
                // if Admin enter 0=1 in operation it means =set bit perform here.
                // 5=0101 <= position 1=0111 answer
            }

            else {
                // if Admin enter 1=0 in operation it means =clear bit perform here.
                // example 5=0101 postion=0 answer=0100
                int notbitmask = ~(bitmask);
                int newnumber = notbitmask & n;
                //clear
                System.out.println(newnumber);
            }
        }
    }

}
