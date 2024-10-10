public class FibonacciRep {
    public static int Fibonacci2(int n) {
        if(n<=1){
            return n;
        }

        int prev = 0;
        int cur = 1;
        int fib = 0;

        for(int i=2; i<=n; i++){
            fib = cur + prev;
            prev = cur;
            cur = fib;
        }
        return fib;
    }
    public static void main(String[] args) {
        System.out.println(Fibonacci2(1));
    }
}
