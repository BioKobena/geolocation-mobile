import java.util.Arrays;

public class CompteMots {
    static int compteMots(String phrase) {
        int comptMot = 0;
        int i = 0;
        while ((i < phrase.length()) && (phrase.charAt(i) != '.')) {
            if (phrase.charAt(i) != ' ') {
                if (phrase.charAt(i + 1) == ' ') {
                    comptMot = comptMot + 1;
                }
            }
            i = i + 1;
        }

        return comptMot;
    }

    public static void main(String[] args) {

        System.out.println("la phrase comporte "
                +compteMots(" Bonjour je suis alice.")+" mots");
    }

}
