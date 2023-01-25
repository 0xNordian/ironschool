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
        public void SetNegativeSalary() {
            Teacher teacher = teachers.get(0);
            assertThrows(IllegalArgumentException.class,  () -> {
                teacher.setSalary(-1000);
            });
        }@Test
        public void AddCourse() {
            Teacher teacher = teachers.get(1);
            Course math = new Course("Math 101", 1000);
            teacher.setCourses(math);
            assertEquals(1, teacher.getCourses().size());
            assertEquals("Math 101", teacher.getCourses().get(0).getCourseName());
        }

        @Test
        public void GetName() {
            Teacher teacher = teachers.get(2);
            assertEquals("Maria", teacher.getName());
        }

        @Test
        public void SetAssigned() {
            Teacher teacher = teachers.get(0);
            teacher.setAssigned(true);
            assertTrue(teacher.isAssigned());
        }
    }

