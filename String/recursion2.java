public class recursion2 {
    public static void printno(int n) {
        if (n == 6)
            return;
        System.out.println(n);
        printno(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
    printno(n);
    }
}
