public class AverageArgs {


    static int MoyenneParametre(int entier1, int entier2, int entier3){
        return (entier1 + entier2 + entier3)/3;
    }

    public static void main(String[] args) {


       System.out.println(MoyenneParametre(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));

    }
}
