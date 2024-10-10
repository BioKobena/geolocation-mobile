public class Equation2Degre {

    static double discriminant(double a, double b, double c) {
        return b*b + 4 *a*c;
    }

    public static void main(String[] args) {

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double x1, x2;
        System.out.println("Veuillez entrer les éléments de l'équation du second dégré sous forme de ax2 + bx + c = 0. Veuillez entrer a, b et c");
        if(a==0) {
            x1 = -c/b;
            System.out.println("Le système d'équation admet une seule solution : " + x1);
        }else if(b==0) {
            x1 = -c/a;
            x2 = c/a;
            System.out.println("Le système admet comme solution x1 = "+ x1 + " et x2 = "+x2);
        }else if (discriminant(a,b,c) == 0.0) {
            x1 = -b/2*a;
            x2 = b/2*a;
            System.out.println("Le système admet comme solution x1 = "+ x1 + " et x2 = "+x2);
        }else if (discriminant(b,a,c) == 0.0) {
            System.out.println("discriminant failed");
        }
        double discriminant = discriminant(a, b, c);
    }
}
