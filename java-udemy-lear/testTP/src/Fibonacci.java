public class Fibonacci {
    static int fibonacci(int n) {

        if(n<=1) {
            return n;
        }
        int fib = 0;
        int prec = 1;
        int curr = 1;

        for(int i=2; i<=n; i++) {
            fib = curr + prec;
            prec = curr;
            curr = fib;
        }
        return fib;
    }
    public static void main(String... args) {
        System.out.println(fibonacci(5));
    }
}