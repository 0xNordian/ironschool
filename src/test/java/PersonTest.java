import org.ironschool.Person;
import org.ironschool.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonTest {

    List<Person> testcases = new ArrayList<>();

    @BeforeEach
    public void setUp(){
        Person p1 = new Student("Name ", "emailtest", "addresstest");
        Person p2 = new Student(" Name ", "emailtest", "addresstest");
        Person p3 = new Student("name surname", "emailtest", "addresstest");
        Person p4 = new Student("NAME SURNAME", "emailtest", "addresstest");
        Person p5 = new Student("name s", "emailtest", "addresstest");
        Person p6 = new Student("n SURNAME", "emailtest", "addresstest");
        testcases.add(p1);
        testcases.add(p2);
        testcases.add(p3);
        testcases.add(p4);
        testcases.add(p5);
        testcases.add(p6);
    }

    @Test
    @DisplayName("setPersonalName() removes trailing whitespace and formats as `Name Surname` given params")
    public void setPersonalName_removesTrailingWhitespace_andCapitalizesFirstLetter(){
        String expectedA = "Name";
        String expectedB = "Name Surname";
        String expectedC = "Name S";
        String expectedD = "N Surname";
        assertEquals(expectedA, testcases.get(0).getPersonalName());
        assertEquals(expectedA, testcases.get(1).getPersonalName());
        assertEquals(expectedB, testcases.get(2).getPersonalName());
        assertEquals(expectedB, testcases.get(3).getPersonalName());
        assertEquals(expectedC, testcases.get(4).getPersonalName());
        assertEquals(expectedD, testcases.get(5).getPersonalName());
    }
    @Test
    @DisplayName("setPersonalName() throws IllegalArgumentException when receiving blank or empty params")
    public void setPersonalName_throwsException_withEmptyOrBlankParam() {
        assertThrows(IllegalArgumentException.class, ()->testcases.get(0).setPersonalName(""));
        assertThrows(IllegalArgumentException.class, ()->testcases.get(0).setPersonalName(" "));
    }

}
