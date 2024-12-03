public class logn {
    public static int lognji(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {

            return 0;
        }
        if (n % 2 == 0) {
            return lognji(x, n / 2) * lognji(x, n / 2);
        } else {
            return lognji(x, n / 2) * lognji(x, n / 2) * x;

        }

    }

    public static void main(String[] args) {
        int n = 5, x = 3;
        int ans = lognji(x, n);

        System.out.println(ans);
    }
}
