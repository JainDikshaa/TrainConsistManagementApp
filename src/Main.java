import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        ArrayList<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display after insertion
        System.out.println("After adding bogies: " + bogies);

        // Remove one bogie
        bogies.remove("AC Chair");

        // Check if Sleeper exists
        boolean exists = bogies.contains("Sleeper");
        System.out.println("Does Sleeper exist? " + exists);

        // Final list
        System.out.println("Final bogie list: " + bogies);
    }
}