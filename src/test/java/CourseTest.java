
import org.ironschool.Course;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
     /*
    //test when it's full of white spaces, IllegalArgumentException thrown
    @Test(expected = IllegalArgumentException.class)
    public <Course> void testCourseName_blankName() {
        Course course = new Course();
        String blankName = "    ";
        course.setCourseName(blankName);
    }
//test if the price is ok
    @Test
    public void SetPrice_ok() {
        Course course = new Course();
        course.setPrice(10);
        assertEquals(10, course.getPrice(), 0);
    }
//test if Course Price is -, thrwos an IllegalsrgumentException
    @Test(expected = IllegalArgumentException.class)
    public void SetPrice_Negative() {
        Course course = new Course();
        course.setPrice(-10);
        fail("Expected IllegalArgumentException to be thrown");
    }
    */
}
