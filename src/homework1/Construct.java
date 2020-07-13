package homework1;
/*
 *@author 27377-sun chao
 *@date 2020/7/13
 *@school  SiChuan University
 */

/**
 * @author 27377
 */
public class Construct {

    public Construct(int x, int y) {
        int max = x > y ? x : y;
        System.out.println("两者中最大的是 " + max);
    }

    public Construct(double a, double b, double c) {
        System.out.println("三者乘积为：" + a * b * c);
    }

    public Construct(String a, String b) {
        boolean ifEqual = a.equals(b);
        if (ifEqual) {
            System.out.println("两者相同");
        } else {
            System.out.println("两者不同");
        }
    }

    public static void main(String[] args) {

        Construct test1 = new Construct(5, 4);
        Construct test2 = new Construct(1.5, 5.2, 6.2);
        Construct test3 = new Construct("hello", "helo");

    }
}