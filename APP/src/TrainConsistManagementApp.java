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
import java.util.Arrays;

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
        System.out.println("=== Sorting Bogie Names using Arrays.sort() ===");

        // Array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Before Sorting
        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Sorting using built-in method
        Arrays.sort(bogieNames);

        // After Sorting
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));
    }
}