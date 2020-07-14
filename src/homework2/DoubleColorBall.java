package homework2;
/*
 *@author 27377-sun chao
 *@date 2020/7/14
 *@school  SiChuan University
 */

import java.util.HashSet;
import java.util.Random;

/**
 * @author 27377
 */
public class DoubleColorBall {
    public static void main(String[] args) {

        HashSet<Integer> redBall = new HashSet<>();
        int blueBall = new Random().nextInt(16) + 1;

        while (redBall.size() < 6) {
            redBall.add(new Random().nextInt(33) + 1);
        }

        System.out.println("红球号码：" + redBall);
        System.out.println("篮球号码：" + blueBall);

    }

}