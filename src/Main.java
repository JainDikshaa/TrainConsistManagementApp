import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs
        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B3");
        bogieIds.add("B2"); // duplicate

        // Display unique IDs
        System.out.println("Unique Bogie IDs: " + bogieIds);
    }
}