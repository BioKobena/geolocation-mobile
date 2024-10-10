public class Somme {

    static int sumOfDigits(int n){
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum += i;
        }
        return sum;
    }

    static int sumOfDigitsRecursive(int n){
        int sum = 0;
        return sum + sumOfDigits(n);
    }

    public static void main(String... args){
        int n = 50;
        System.out.println(sumOfDigits(n));
        System.out.println(sumOfDigitsRecursive(n));
    }
}
