import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // LinkedHashSet (unique + maintains order)
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate
        train.add("Sleeper"); // will be ignored

        // Display formation
        System.out.println("Train Formation: " + train);
    }
}