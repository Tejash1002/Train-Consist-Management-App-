import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class BogieTest{

    // Helper method to create sample list
    private List<Bogie> createBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 24));
        list.add(new Bogie("General", 90));
        return list;
    }

    @Test
    public void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> result = TrainConsistManagementApp.filterBogies(createBogies(), 70);
        assertEquals(2, result.size());
    }

    @Test
    public void testFilter_CapacityEqualToThreshold() {
        List<Bogie> result = TrainConsistManagementApp.filterBogies(createBogies(), 72);
        assertEquals(1, result.size()); // only > threshold
    }

    @Test
    public void testFilter_CapacityLessThanThreshold() {
        List<Bogie> result = TrainConsistManagementApp.filterBogies(createBogies(), 100);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testFilter_MultipleBogiesMatching() {
        List<Bogie> result = TrainConsistManagementApp.filterBogies(createBogies(), 50);
        assertEquals(3, result.size()); // ✅ FIXED
    }

    @Test
    public void testFilter_NoBogiesMatching() {
        List<Bogie> result = TrainConsistManagementApp.filterBogies(createBogies(), 200);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testFilter_AllBogiesMatching() {
        List<Bogie> result = TrainConsistManagementApp.filterBogies(createBogies(), 10);
        assertEquals(4, result.size());
    }

    @Test
    public void testFilter_EmptyBogieList() {
        List<Bogie> result = TrainConsistManagementApp.filterBogies(new ArrayList<>(), 50);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testFilter_OriginalListUnchanged() {
        List<Bogie> original = createBogies();
        TrainConsistManagementApp.filterBogies(original, 60);
        assertEquals(4, original.size()); // unchanged
    }
}