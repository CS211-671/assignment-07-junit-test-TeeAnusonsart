package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testAddScore(){
        Student s1= new Student("516515","hello");
        s1.addScore(5);
        assertEquals(5,s1.getScore());
        s1.addScore(5);
        assertEquals(10,s1.getScore());
    }

    @Test
    void testCalculateGrade(){
        Student s1= new Student("516515","hello");
        s1.addScore(60);
        assertEquals("C",s1.grade());
    }

    @Test
    void testChangeName(){
        Student s1= new Student("516515","hello");
        s1.changeName("tee");
        assertEquals("tee",s1.getName());
    }

    @Test
    void testIsId(){
        Student s1= new Student("516515","hello");
        assertTrue(s1.isId("516515"));
    }
}