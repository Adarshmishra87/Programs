public class recurssion {
    public static void printnumber(int n) {
        if (n == 0)//base condition
            return;
        System.out.println(n);
        printnumber(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printnumber(n);//n=5

    }
}
