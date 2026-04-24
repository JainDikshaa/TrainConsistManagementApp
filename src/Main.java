import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // HashMap: Bogie -> Capacity
        HashMap<String, Integer> capacityMap = new HashMap<>();

        // Insert values
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 40);

        // Iterate using entrySet()
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}