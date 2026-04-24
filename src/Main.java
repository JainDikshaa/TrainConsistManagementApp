import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> list = new ArrayList<>();

        // Same data as UC7
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 60));
        list.add(new Bogie("First Class", 40));

        // Stream + filter
        List<Bogie> filtered = list.stream()
                .filter(b -> b.capacity > 60)
                .toList();

        // Display
        System.out.println("Filtered Bogies (capacity > 60):");
        for (Bogie b : filtered) {
            System.out.println(b);
        }
    }
}