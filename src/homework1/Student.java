package homework1;
/*
 *@author 27377-sun chao
 *@date 2020/7/13
 *@school  SiChuan University
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 27377
 */
public class Student {
    /**
     * 学号
     **/
    private int no;
    /**
     * 年级
     **/
    private int state;
    /**
     * 成绩
     **/
    private int score;

    public Student(int no, int state, int score) {
        this.no = no;
        this.state = state;
        this.score = score;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Random random = new Random();

        int numOfStudent = 20;
        //构造20个随机学生对象
        for (int i = 1; i <= numOfStudent; i++) {
            Student e = new Student(i, random.nextInt(6) + 1, random.nextInt(100));
            //构造学生对象，学号按顺序来，年级在1-6之间，成绩在0-100之间
            students.add(e);
        }

        //打印三年级的学生信息
        printByState(students, 3);

        //打印排序后的学生信息
        sortByScore(students);

    }

    /**
     * 按成绩排序函数
     *
     * @param students
     */
    private static void sortByScore(List<Student> students) {
        System.out.println("按成绩排序后学生信息如下：");
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j + 1).getScore() < students.get(j).getScore()) {
                    Student stu = students.get(j + 1);
                    students.set(j + 1, students.get(j));
                    students.set(j, stu);
                }
            }
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    /**
     *
     */
    private static void printByState(List<Student> students, int state) {
        System.out.println(state + "年级学生信息如下");
        for (Student student : students) {
            if (student.getState() == state) {
                System.out.println(student);
            }

        }
    }

    /**
     * 重写toString方法
     */
    @Override
    public String toString() {
        return "学号：" + this.getNo() + "  年级：" + this.getState() + "  成绩：" + this.getScore();
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}