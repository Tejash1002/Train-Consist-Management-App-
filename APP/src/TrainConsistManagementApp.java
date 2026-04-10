import java.util.*;
import java.util.stream.Collectors;

// Bogie Class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

// Main Class
public class TrainConsistManagementApp {

    // Method for filtering (IMPORTANT for testing)
    public static List<Bogie> filterBogies(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("=== Filter Passenger Bogies (Capacity > 60) ===");

        // Create list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Filter
        List<Bogie> filtered = filterBogies(bogies, 60);

        // Display result
        System.out.println("\nFiltered Bogies:");
        for (Bogie b : filtered) {
            b.display();
        }
    }
}