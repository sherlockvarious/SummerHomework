package homework2;
/*
 *@author 27377-sun chao
 *@date 2020/7/14
 *@school  SiChuan University
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @author 27377
 */
public class Poker {

    public static void main(String[] args) {
        //存储牌和对应的索引
        HashMap<Integer, String> poker = new HashMap<>();

        //牌的索引
        List<Integer> pokerIndex = new ArrayList<>();


        //设置牌的花色和大小
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};


        //组合成牌
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index++, number + color);
            }
        }

        //添加大小王
        poker.put(index++, "大🃏");
        poker.put(index, "小🃏");

        for (int i = 0; i <= index; i++) {
            pokerIndex.add(i);
        }

        //洗牌
        Collections.shuffle(pokerIndex);


        List<Integer> poker01Index = new ArrayList<>();
        List<Integer> poker02Index = new ArrayList<>();
        List<Integer> poker03Index = new ArrayList<>();
        List<Integer> bottomCardIndex = new ArrayList<>();


        for (int i = 0; i <= index; i++) {
            if (i > 50) {
                bottomCardIndex.add(i);
            } else {
                if (i % 3 == 0) {
                    poker01Index.add(i);
                } else if (i % 3 == 1) {
                    poker02Index.add(i);
                } else {
                    poker03Index.add(i);
                }
            }
        }

        //排序
        Collections.sort(poker01Index);
        Collections.sort(poker02Index);
        Collections.sort(poker03Index);
        Collections.sort(bottomCardIndex);


        //三个玩家的手牌和底牌
        List<String> poker01 = new ArrayList<>();
        List<String> poker02 = new ArrayList<>();
        List<String> poker03 = new ArrayList<>();
        List<String> bottomCard = new ArrayList<>();

        for (Integer cardIndex : bottomCardIndex) {
            bottomCard.add(poker.get(cardIndex));
        }
        for (Integer integer : poker03Index) {
            poker03.add(poker.get(integer));
        }
        for (Integer integer : poker02Index) {
            poker02.add(poker.get(integer));
        }
        for (Integer integer : poker01Index) {
            poker01.add(poker.get(integer));
        }


        System.out.println("bottomCard = " + bottomCard);
        System.out.println("poker01 = " + poker01);
        System.out.println("poker02 = " + poker02);
        System.out.println("poker03 = " + poker03);


    }
}