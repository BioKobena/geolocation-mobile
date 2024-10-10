public class Digital {

    static int digitalIteratif(int rang, int nombre) {
        int result = 0;
        int n = nombre;
        while (result != rang) {
            n = n / 10;
            result = result + 1;
        }
        return n % 10;
    }

    static int digitRecursif(int rang, int nombre) {
        if (rang == 0) {
            return nombre % 10;
        } else {
            return digitRecursif(rang - 1, nombre / 10);
        }

    }

    public static void main(String[] args) {

        System.out.println(digitalIteratif(2, 245));
        System.out.println(digitalIteratif(3, 24534));
        System.out.println(digitalIteratif(6, 25));

        System.out.println(digitRecursif(2, 245));
        System.out.println(digitRecursif(3, 24534));
        System.out.println(digitRecursif(6, 25));

    }
}