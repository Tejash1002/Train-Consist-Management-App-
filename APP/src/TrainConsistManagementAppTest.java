import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import java.util.stream.Collectors;

public class  TrainConsistManagementAppTest {

    // Helper method
    private List<Bogie> createBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("First Class", 48));
        return list;
    }

    // Test 1: Grouping works correctly
    @Test
    public void testGrouping_Basic() {
        Map<String, List<Bogie>> result =
                createBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(3, result.size()); // Sleeper, AC Chair, First Class
    }

    // Test 2: Duplicate bogies grouped together
    @Test
    public void testGrouping_Duplicates() {
        Map<String, List<Bogie>> result =
                createBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(2, result.get("Sleeper").size());
    }

    // Test 3: Single bogie group
    @Test
    public void testGrouping_SingleEntry() {
        Map<String, List<Bogie>> result =
                createBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(1, result.get("AC Chair").size());
    }

    // Test 4: Empty list
    @Test
    public void testGrouping_EmptyList() {
        Map<String, List<Bogie>> result =
                new ArrayList<Bogie>().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertTrue(result.isEmpty());
    }

    // Test 5: All same bogie type
    @Test
    public void testGrouping_AllSameType() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("Sleeper", 60));

        Map<String, List<Bogie>> result =
                list.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(1, result.size());
        assertEquals(2, result.get("Sleeper").size());
    }

    // Test 6: Original list unchanged
    @Test
    public void testGrouping_OriginalListUnchanged() {
        List<Bogie> original = createBogies();

        original.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(4, original.size());
    }
}