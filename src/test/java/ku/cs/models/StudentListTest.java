package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void testAddNewStudent(){
        StudentList list = new StudentList();
        list.addNewStudent("1234", "Doe");
        Student actual=list.findStudentById("1234");
        assertNotNull(actual);
    }

    @Test
    void testFindStudentById(){
        StudentList list = new StudentList();
        list.addNewStudent("1234", "Doe");
        Student find=list.findStudentById("1234");
        assertNotNull(find);
    }

    @Test
    void testGiveScoreToId(){
        StudentList list = new StudentList();
        list.addNewStudent("1234", "Doe");
        list.addNewStudent("123", "Capybara");
        list.giveScoreToId("123",20);
        assertEquals(20,list.findStudentById("123").getScore());

    }

    @Test
    void testViewGradeOfId(){
        StudentList list = new StudentList();
        list.addNewStudent("1234", "Doe");
        list.addNewStudent("123", "Capybara",80);
        String actual=list.viewGradeOfId("123");
        assertEquals(list.findStudentById("123").grade(),actual);
    }


}