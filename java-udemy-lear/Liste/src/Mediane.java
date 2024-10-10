public class Mediane {

    static int mediane(int entier1, int entier2, int entier3){
        if((entier1 > entier2 && entier1 < entier3) || (entier1 > entier3 && entier1 < entier2)){
            return entier1;
        } else if ((entier2 > entier1 && entier2 < entier3) || (entier2 > entier3 && entier2 < entier1)) {
            return entier2;
        }else {
            return entier3;
        }
    }

    static public void main(String... args){
        System.out.println("La médiane est : " + mediane(8, 1, 4));
        System.out.println("La médiane est : " + mediane(8, 4, 1));
        System.out.println("La médiane est : " + mediane(1, 8, 4));
        System.out.println("La médiane est : " + mediane(1, 4, 8));
        System.out.println("La médiane est : " + mediane(4, 1, 8));
        System.out.println("La médiane est : " + mediane(4, 8, 1));
    }
}
