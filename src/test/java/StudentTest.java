import static org.junit.Assert.*;

import org.ironschool.Course;
import org.ironschool.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    private List<Student> students;

    @BeforeEach
    public void setUp() {
        students = new ArrayList<>();
        students.add(new Student("Jordi", "Jordi@example.com", "Calle 1"));
        students.add(new Student("Meri", "Meri@example.com", "Calle 2"));
        students.add(new Student("Mari", "Mari@example.com", "Calle 3"));
    }

    @Test
    public void testEnroll() {
        Student student = students.get(0);
        student.setEnrolled(true);
        assertTrue(student.isEnrolled());
    }

    @Test
    public void testAddCourse() {
        Student student = students.get(1);
        Course math = new Course("Math 101", 1000);
        student.setCourses(math);
        assertEquals(1, student.getCourses().size());
        assertEquals("Math 101", student.getCourses().get(0).getCourseName());
    }

    @Test
    public void testGetName() {
        Student student = students.get(2);
        assertEquals("Mari", student.getName());
    }
}


