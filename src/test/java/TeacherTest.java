import static org.junit.Assert.*;
import org.ironschool.Course;
import org.ironschool.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class TeacherTest {
        private List<Teacher> teachers;

        @BeforeEach
        public void setUp() {
            teachers = new ArrayList<>();
            teachers.add(new Teacher("Jordi", "Jordi@example.com", "calle 1", 5000));
            teachers.add(new Teacher("Meri", "Meri@example.com", "calle 2", 6000));
            teachers.add(new Teacher("Maria", "Maria@example.com", "call 3", 7000));
        }

        @Test
        public void testSetNegativeSalary() {
            Teacher teacher = teachers.get(0);
            try {
                teacher.setSalary(-1000);
                fail("Expected IllegalArgumentException to be thrown");
            } catch (IllegalArgumentException e) {
                assertEquals("Salary cannot be negative or 0 and have to be a number", e.getMessage());
            }
        }

        @Test
        public void testAddCourse() {
            Teacher teacher = teachers.get(1);
            Course math = new Course("Math 101", 1000);
            teacher.setCourses(math);
            assertEquals(1, teacher.getCourses().size());
            assertEquals("Math 101", teacher.getCourses().get(0).getCourseName());
        }

        @Test
        public void testGetName() {
            Teacher teacher = teachers.get(2);
            assertEquals("Maria", teacher.getName());
        }

        @Test
        public void testSetAssigned() {
            Teacher teacher = teachers.get(0);
            teacher.setAssigned(true);
            assertTrue(teacher.isAssigned());
        }
    }

