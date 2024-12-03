public class stackrecurrsion {
    public static int calculatePower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int powernm1 = calculatePower(x, n - 1);
        int powern = x * powernm1;
        return powern;
    }

    public static void main(String[] args) {
        int n = 5, x = 2;
        calculatePower(x, n);
        System.out.println(calculatePower(x, n));
    }
}
