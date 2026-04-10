import java.util.*;

class GoodsBogie {
    String type;
    String cargo;

    // Constructor
    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    // Getters
    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    // Display
    public void display() {
        System.out.println(type + " Bogie carrying " + cargo);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Safety Compliance Check ===");

        // Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Display bogies
        System.out.println("\nBogie Details:");
        for (GoodsBogie b : bogies) {
            b.display();
        }

        // Safety validation using stream + allMatch
        boolean isSafe = bogies.stream().allMatch(b ->
                // Rule:
                // If Cylindrical → must carry Petroleum
                !b.getType().equalsIgnoreCase("Cylindrical") ||
                        b.getCargo().equalsIgnoreCase("Petroleum")
        );

        // Result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }
    }
}