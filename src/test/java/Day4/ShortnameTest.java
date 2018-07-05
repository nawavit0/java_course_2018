package Day4;

import Day4.Shortname;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ShortnameTest {

    @Test
    public void TEST001_split_United_States_Of_America() {
        Shortname shortname = new Shortname();
        String[] expectedStr = {"United","States","of","America"};
        int expectedSize = 4;
        String[] actualStr = shortname.splitName("United States of America");
        int actualSize = actualStr.length;
        assertEquals(expectedSize, actualSize);
        assertArrayEquals(expectedStr, actualStr);
    }

    @Test
    public void TEST002_filter_United_States_Of_America() {
        Shortname shortname = new Shortname();
        List<String> expectedList = new ArrayList<>();
        expectedList.add("United");
        expectedList.add("States");
        expectedList.add("America");
        int expectedSize = 3;
        List<String> actualList = shortname.filterName("United States of America");
        int actualSize = actualList.size();
        assertEquals(expectedSize, actualSize);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void TEST003_United_States_Of_America_to_USA() {
        Shortname shortname = new Shortname();
        String expected = "USA";
        String actual = shortname.gen("United States of America");
        assertEquals(expected, actual);
    }

    @Test
    public void TEST004_united_states_of_america_to_USA() {
        Shortname shortname = new Shortname();
        String expected = "USA";
        String actual = shortname.gen("united states of america");
        assertEquals(expected, actual);
    }

    @Test
    public void TEST005_united_states_of_america_to_USA_stream() {
        Shortname shortname = new Shortname();
        String expected = "USA";
        String actual = shortname.genStream("united states of america");
        assertEquals(expected, actual);
    }
}
