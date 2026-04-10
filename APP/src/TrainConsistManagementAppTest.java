import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class TrainConsistManagementAppTest {

    // -------- Helper Method --------
    private List<Bogie> createBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 60));
        list.add(new Bogie("First Class", 50));
        list.add(new Bogie("Sleeper", 80));
        list.add(new Bogie("AC Chair", 70));
        return list;
    }

    // -------- REGEX TESTS --------

    @Test
    public void testValidTrainID() {
        assertTrue(TrainConsistManagementApp.isValidTrainID("TRN-1234"));
    }

    @Test
    public void testInvalidTrainID() {
        assertFalse(TrainConsistManagementApp.isValidTrainID("TRN-12A4"));
    }

    @Test
    public void testValidCargoCode() {
        assertTrue(TrainConsistManagementApp.isValidCargoCode("PET-AB"));
    }

    @Test
    public void testInvalidCargoCode() {
        assertFalse(TrainConsistManagementApp.isValidCargoCode("PET-A1"));
    }

    // -------- GROUPING TESTS --------

    @Test
    public void testGrouping_Size() {
        Map<String, List<Bogie>> result =
                TrainConsistManagementApp.groupBogiesByType(createBogies());

        assertEquals(3, result.size()); // Sleeper, AC Chair, First Class
    }

    @Test
    public void testGrouping_SleeperCount() {
        Map<String, List<Bogie>> result =
                TrainConsistManagementApp.groupBogiesByType(createBogies());

        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    public void testGrouping_ACChairCount() {
        Map<String, List<Bogie>> result =
                TrainConsistManagementApp.groupBogiesByType(createBogies());

        assertEquals(2, result.get("AC Chair").size());
    }

    @Test
    public void testGrouping_SingleEntry() {
        Map<String, List<Bogie>> result =
                TrainConsistManagementApp.groupBogiesByType(createBogies());

        assertEquals(1, result.get("First Class").size());
    }

    // -------- EDGE CASES --------

    @Test
    public void testGrouping_EmptyList() {
        Map<String, List<Bogie>> result =
                TrainConsistManagementApp.groupBogiesByType(new ArrayList<>());

        assertTrue(result.isEmpty());
    }

    @Test
    public void testOriginalList_Unchanged() {
        List<Bogie> original = createBogies();

        TrainConsistManagementApp.groupBogiesByType(original);

        assertEquals(5, original.size()); // unchanged
    }
}