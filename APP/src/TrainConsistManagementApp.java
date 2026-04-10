import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

// Bogie Class
class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return type + " | Capacity: " + capacity;
    }
}

// Main Class
public class TrainConsistManagementApp {

    // Regex Validation Methods
    public static boolean isValidTrainID(String trainId) {
        return Pattern.matches("TRN-\\d{4}", trainId);
    }

    public static boolean isValidCargoCode(String cargoCode) {
        return Pattern.matches("PET-[A-Z]{2}", cargoCode);
    }

    // Grouping Method
    public static Map<String, List<Bogie>> groupBogiesByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");

        // ---------------- REGEX VALIDATION ----------------
        System.out.print("Enter Train ID: ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = scanner.nextLine();

        System.out.println("\nValidation Results:");
        System.out.println(isValidTrainID(trainId) ? "Valid Train ID" : "Invalid Train ID");
        System.out.println(isValidCargoCode(cargoCode) ? "Valid Cargo Code" : "Invalid Cargo Code");

        // ---------------- HASHMAP ----------------
        HashMap<String, Integer> bogieCapacity = new HashMap<>();
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 40);

        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // ---------------- LINKEDHASHSET ----------------
        LinkedHashSet<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper"); // duplicate ignored

        System.out.println("\nTrain Formation:");
        for (String bogie : formation) {
            System.out.println(bogie);
        }

        // ---------------- STREAM GROUPING ----------------
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 70));

        Map<String, List<Bogie>> grouped = groupBogiesByType(bogies);

        System.out.println("\nGrouped Bogies:");
        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }

        scanner.close();
    }
}