import java.util.ArrayList;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 48));

        // Calculate total seating capacity
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)       // extract capacity
                .reduce(0, Integer::sum);   // sum all values

        // Display result
        System.out.println("Total Seating Capacity: " + totalSeats);

        // Original list remains unchanged
        System.out.println("Number of Bogies: " + bogies.size());
    }
}