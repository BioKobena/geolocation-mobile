public class Occurence {
    static int nbOcc(String mot, char occ) {
        int taille = mot.length();
        int indice = 0;
        int compteur = 0;

        while (indice < taille) {
            if (mot.charAt(indice) == occ) {
                compteur = compteur + 1;
            }
            indice = indice + 1;
        }
        return compteur;
    }

    public static void main(String[] args) {
        System.out.println(nbOcc("abracadabra", 'a'));
        System.out.println(nbOcc("lol", 'a'));
        System.out.println(nbOcc("syntiche", 'i'));
        System.out.println(nbOcc("moi", 'k'));
        System.out.println(nbOcc("", 'k'));


    }

}
