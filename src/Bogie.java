import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> list = new ArrayList<>();

        // Add bogies
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 60));
        list.add(new Bogie("First Class", 40));

        // Sort using Comparator
        list.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted list
        System.out.println("Sorted Bogies by Capacity:");
        for (Bogie b : list) {
            System.out.println(b);
        }
    }
}