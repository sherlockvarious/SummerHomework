package homework1;
/*
 *@author 27377-sun chao
 *@date 2020/7/13
 *@school  SiChuan University
 */

/**
 * @author 27377
 */
public class StudentCon {
    /**
     * 学号
     **/
    private int no;
    /**
     * 姓名
     **/
    private String name;

    public StudentCon(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof StudentCon) {
            return ((StudentCon) obj).no == this.no && ((StudentCon) obj).name == this.name;
        }
        return false;
    }

    @Override
    public String toString() {
        return "学生" + this.name + "学号为" + this.no;
    }
}