package homework1;
/*
 *@author 27377-sun chao
 *@date 2020/7/13
 *@school  SiChuan University
 */

import java.util.Scanner;

/**
 * @author 27377
 */
public class ScanFromKeyboard {
    private static final int NUMOFPEOPLE = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /**成绩数组**/
        int[] arr = new int[NUMOFPEOPLE];
        /**总分**/
        int sum = 0;
        /**高于平均成绩的人数**/
        int num = 0;
        for (int i = 0; i < NUMOFPEOPLE; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }

        double avg = ((double) sum) / NUMOFPEOPLE;
        System.out.println("平均成绩为" + avg);
        for (int i = 0; i < NUMOFPEOPLE; i++) {
            if (arr[i] > avg) {
                num++;
            }
        }
        System.out.println("高于平均成绩的人数为" + num);

    }


}