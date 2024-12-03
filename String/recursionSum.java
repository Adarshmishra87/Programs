public class recursionSum {
    public static void printSum(int n,int j,int sum){
        if(n==j){
            sum+=n;
            System.out.println(sum);
            return ;
        }
        sum+=n;
            printSum(n+1, j, sum);
    }
    public static void main(String[] args) {
        printSum(1, 4, 0);
    }
}
