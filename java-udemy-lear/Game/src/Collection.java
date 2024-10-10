import java.util.*;

public class Collection {
    public static void main(String[] args) {
        // Utilisation d'une ArrayList
        List<String> listeDeNoms = new ArrayList<>();
        listeDeNoms.add("Alice");
        listeDeNoms.add("Bob");
        listeDeNoms.add("Charlie");

        // Utilisation d'un HashSet
        Set<String> ensembleDeNoms = new HashSet<>();
        ensembleDeNoms.add("Alice");
        ensembleDeNoms.add("Bob");
        ensembleDeNoms.add("Alice"); // Duplication ignorée

        // Utilisation d'un HashMap
        Map<String, Integer> mapDeNoms = new HashMap<>();
        mapDeNoms.put("Alice", 30);
        mapDeNoms.put("Bob", 25);

        // Affichage des éléments
        System.out.println("Liste : " + listeDeNoms);
        System.out.println("Ensemble : " + ensembleDeNoms);
        System.out.println("Map : " + mapDeNoms);
    }
}
