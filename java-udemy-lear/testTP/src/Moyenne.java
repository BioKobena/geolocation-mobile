import java.util.Scanner;

public class Moyenne {

    public static void main(String... args) {
        boolean verif = true;
        Scanner scanner = new Scanner(System.in) ;

        int i = 0;
        int nombre = 0;
        int entiers = 0;
        System.out.print("Veuillez entrer le nombre :");
        while (verif) {
            nombre = scanner.nextInt();
            if (nombre >= 0) {
                entiers += nombre;
                i = i+1;
            } else {
                verif = false;
            }

        }
        scanner.close();
        System.out.println((double) entiers/ i);
    }
}
