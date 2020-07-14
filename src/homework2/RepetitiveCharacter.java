package homework2;
/*
 *@author 27377-sun chao
 *@date 2020/7/14
 *@school  SiChuan University
 */

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author 27377
 */
public class RepetitiveCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        HashSet<Character> hashSet = new HashSet<>();
        HashSet<Character> once = new HashSet<>();
        HashSet<Character> moreThanOnce = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!hashSet.add(c)) {
                moreThanOnce.add(c);
                once.remove(c);
            } else {
                once.add(c);
            }

        }

        System.out.println("重复的字符" + moreThanOnce);
        System.out.println("不重复的字符" + once);
        System.out.println("消除重复后的字符列表" + hashSet);

    }
}