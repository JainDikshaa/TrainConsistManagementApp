import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> list = new ArrayList<>();

        // Add bogies with type
        list.add(new Bogie("Sleeper", 72, "Passenger"));
        list.add(new Bogie("AC Chair", 60, "Passenger"));
        list.add(new Bogie("Cargo", 100, "Goods"));
        list.add(new Bogie("Parcel", 80, "Goods"));

        // Group by type
        Map<String, List<Bogie>> grouped =
                list.stream()
                        .collect(Collectors.groupingBy(b -> b.type));

        // Display grouped data
        System.out.println("Grouped Bogies:");
        for (String key : grouped.keySet()) {
            System.out.println(key + " -> " + grouped.get(key));
        }
    }
}