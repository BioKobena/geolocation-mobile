public class IndexOfMax {


    static int indexOfMax(int[] tab) {
        int max = tab[0];
        int index = 0 ;
        for(int i=1 ; i<tab.length ; i++) {
            if(max <= tab[i]) {
                max = tab[i];
                index = i ;
            }
        }
        return index;

    }

    public static void main(String[]  args) {
        int[] x = {2,4,18,7};
        System.out.println("Le maximum du tableau est : "+indexOfMax(x));
    }

}
