
import org.ironschool.Course;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CourseTest {
    //test if name course is valid
    @Test
    public void testCourseName_validName() {
        Course course = new Course("  mana",2000);
        String validName = "Mana";

        // Assert that the course name was set correctly
        assertEquals(validName, course.getCourseName());
    }
    //test when it's empty, IllegalArgumentException thrown

    @Test
    @DisplayName("expected = IllegalArgumentException.class")
    public void testCourseName_whiteSpaceName() {


        assertThrows(IllegalArgumentException.class, ()-> new Course("",2000));
    }
}
