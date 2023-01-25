import org.ironschool.School;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SchoolTest {
    private School example = new School("salesians");




    @Test
    public void testSetSchoolName() {
        assertEquals("Salesians", example.getSchoolName());
    }

    @Test
    public void testSetSchoolNameWithEmptyString() {
        assertThrows(IllegalArgumentException.class, ()->new School(""));
    }

    @Test
    public void testSetSchoolNameWithBlankString() {
        assertThrows(IllegalArgumentException.class,  ()->new School("  "));
    }
   /* @Test
    public void testSetSchoolRevenue() {
        example.setSchoolRevenue(10000);
        assertEquals(10000, example.getSchoolRevenue(), 0.1);
    }

    @Test
    public void testSetSchoolRevenueWithNegativeValue() {
        assertThrows(IllegalArgumentException.class,()-> example.setSchoolRevenue(-2000));

    }
    */

}
