package Recurrsion;

public class recurssion2 {
    public static void tower(int n, String src, String Help, String Dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + Dest);
            return;
        }
        tower(n - 1, src, Dest, Help);
        System.out.println("transfer disk " + n + " from " + src + " to " + Dest);
        tower(n - 1, Help, src, Dest);
    }

    public static void main(String[] args) {
        int n = 3;
        tower(n, "S", "H", "D");

    }
}
