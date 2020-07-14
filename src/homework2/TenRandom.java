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
public class TenRandom {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet<>();

        int num = 0;
        while (num < 10) {
            if (hashSet.add(random.nextInt(20) + 1)) {
                num++;
            }
        }

        System.out.println(hashSet);
    }
}