public class Fibonacci {

   static int fibonacci(int n) {
        int fib = 0;
        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            fib = curr;
            prev = curr;
            curr = fib + prev;
        }
        return fib;
    }
    static public void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
