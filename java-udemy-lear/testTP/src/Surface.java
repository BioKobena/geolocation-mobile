public class Surface {

    static final float PI = 3.15F;

    static double surfaceCercle(double rayon){
        return PI * (rayon * rayon);
    }

    static double surfaceCouronne(double cercle1,double cercle2){
        return surfaceCercle(cercle1) > surfaceCercle(cercle2 ) ? surfaceCercle(cercle1)-surfaceCercle(cercle2) : surfaceCercle(cercle2)-surfaceCercle(cercle1);
    }

    static public void main(String... args){

        System.out.println("La surface de la couronne 1 de r1 = 2.3 et r2 = 4.1 est : "+ surfaceCouronne(2.3f,4.1f));
        System.out.println("La surface de la couronne 2 de r1 = 4.1 et r2 = 2.3 est : "+ surfaceCouronne(2.3f,4.1f));
        //Arguments passés en paramètre venant de main(String... args)
      //  System.out.println("La surface de la couronne 3 de r1 = " + args[0] + " et r2 = " + args[1] + " est : "+ surfaceCouronne(Double.parseDouble(args[0]),Double.parseDouble(args[1])));
    }
}
