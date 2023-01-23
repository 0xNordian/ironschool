import org.ironschool.School;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SchoolTest {
    public School example = new School();

    @Test
    public void testSetSchoolName() {
        example.setSchoolName("school name");
        assertEquals("School name", example.getSchoolName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSchoolNameWithEmptyString() {
        example.setSchoolName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSchoolNameWithBlankString() {
        example.setSchoolName("   ");
    }
    @Test
    public void testSetSchoolRevenue() {
        example.setSchoolRevenue(10000.0);
        assertEquals(10000.0, example.getSchoolRevenue(), 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSchoolRevenueWithNegativeValue() {
        example.setSchoolRevenue(-100.0);
    }
}
