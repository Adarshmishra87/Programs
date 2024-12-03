public class factorail {
    public static int calculatefact(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = calculatefact(n - 1);
        int fact_n = n * fact_nm1;
        System.out.println(fact_n);
        return fact_n;
    }

    public static void main(String[] args) {
        int ans = calculatefact(5);
        System.out.println(ans);
    }
}
