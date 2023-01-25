
import org.ironschool.Course;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CourseTest {
    //test if name course is valid
    @Test
    public void testCourseName_validName() {
        Course course = new Course("  gem",2000);
        String validName = "Gem";

        // Assert that the course name was set correctly
        assertEquals(validName, course.getCourseName());
    }
    //test when it's empty, IllegalArgumentException thrown

    @Test
    @DisplayName("expected = IllegalArgumentException.class")
    public void testCourseName_whiteSpaceName() {


        assertThrows(IllegalArgumentException.class, ()-> new Course("  ",2000));
    }

    //test when it's full of white spaces, IllegalArgumentException thrown
    @Test
    @DisplayName("expected = IllegalArgumentException.class")
    public void testCourseName_blankName() {
        assertThrows(IllegalArgumentException.class, ()-> new Course("",4000));
    }


//test if Course Price is -, thrwos an IllegalsrgumentException
    @Test
    public void SetPrice_isNegative() {
        assertThrows(IllegalArgumentException.class, ()-> new Course("Gem", -2000));
       // double validPrice =  4000;
        //assertEquals(10, course.getPrice(), 0);

    }

//test if the price is ok
    @Test
    public void SetPrice_isOk() {
        Course course = new Course("Gem",2000);
        double validPrice = 2000;

        // Assert that the course name was set correctly
        assertEquals(validPrice, course.getPrice());
    }

}
