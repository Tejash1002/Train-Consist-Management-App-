import java.util.Arrays;

        public class TrainConsistManagementApp {

            public static void main(String[] args) {

                System.out.println("=== Train Consist Management App ===");

                // Create list of bogies
                List<Bogie> bogies = new ArrayList<>();
                bogies.add(new Bogie("Sleeper", 72));
                bogies.add(new Bogie("AC Chair", 56));
                bogies.add(new Bogie("Sleeper", 72));   // duplicate type
                bogies.add(new Bogie("First Class", 48));

                // Group bogies by type (name)
                Map<String, List<Bogie>> groupedBogies = bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

                // Display grouped result
                System.out.println("Grouped Bogies:");

                for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }

                // Show original list unchanged
                System.out.println("Original List:");
                System.out.println(bogies);
            }
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
