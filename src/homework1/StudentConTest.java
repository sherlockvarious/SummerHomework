package homework1;


import org.junit.jupiter.api.BeforeEach;

/*

需要导入JUnit包才能正常运行

 */

/*
 *@author 27377-sun chao
 *@date 2020/7/13
 *@school  SiChuan University
 */

class StudentConTest {

    StudentCon test;

    @BeforeEach
    public void setup() throws Exception{
        test = new StudentCon(25,"john");
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
        StudentCon test2 = new StudentCon(25,"john");
        StudentCon test3 = new StudentCon(25,"johh");
        StudentCon test4 = new StudentCon(24,"johh");

        System.out.println(test.equals(test2));
        System.out.println(test.equals(test3));
        System.out.println(test.equals(test4));

    }

    @org.junit.jupiter.api.Test
    void testToString() {
        System.out.println(test);
    }
}