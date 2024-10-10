public class estPalindrome {


    // Méthode pour vérifier si une chaîne est un palindrome
    public static boolean estPalindrome(String chaine) {
        int longueur = chaine.length();


        // Parcours de la moitié de la chaîne
        for (int i = 0; i < longueur / 2; i++) {
            // Comparer le caractère à la position i avec celui à la position symétrique
            if (chaine.charAt(i) != chaine.charAt(longueur - i - 1)) {
                return false; // Si les caractères ne correspondent pas, ce n'est pas un palindrome
            }
        }

        return true; // Si toutes les comparaisons réussissent, c'est un palindrome
    }

    public static void main(String[] args) {
        String mot = "radar";


        if (estPalindrome(mot)) {
            System.out.println(mot + " est un palindrome.");
        } else {
            System.out.println(mot + " n'est pas un palindrome.");
        }
    }
}
