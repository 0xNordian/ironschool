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
        Person p1 = new Student("Name ", "email@test.test ", "addresstest");
        Person p2 = new Student(" Name ", " email@test.test ", "addresstest");
        Person p3 = new Student("name surname", "email@TEST.test", "addresstest");
        Person p4 = new Student("NAME SURNAME", "EMAIL@test.Test", "addresstest");
        Person p5 = new Student("name s", "email@te st.test", "addresstest");
        Person p6 = new Student("n SURNAME", "email @test.test", "addresstest");
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
    @Test
    @DisplayName("setEmail() removes whitespace and set param to lowercase")
    public void setEmail_removesTrailingWhitespace_andSetsToLowercase(){
        String expectedA = "email@test.test";
        assertEquals(expectedA, testcases.get(0).getEmail());
        assertEquals(expectedA, testcases.get(1).getEmail());
        assertEquals(expectedA, testcases.get(2).getEmail());
        assertEquals(expectedA, testcases.get(3).getEmail());
        assertEquals(expectedA, testcases.get(4).getEmail());
        assertEquals(expectedA, testcases.get(5).getEmail());
    }
    @Test
    @DisplayName("setEmail() throws IllegalArgumentException when receiving blank/empty params or param does not contain '@'")
    public void setEmail_throwsException_withEmptyOrBlankParam_orParamWithoutAtSign(){
        assertThrows(IllegalArgumentException.class, ()->testcases.get(0).setEmail(""));
        assertThrows(IllegalArgumentException.class, ()->testcases.get(0).setEmail(" "));
        assertThrows(IllegalArgumentException.class, ()->testcases.get(0).setEmail("testattest"));
        assertThrows(IllegalArgumentException.class, ()->testcases.get(0).setEmail("testattest.com"));
    }

}
