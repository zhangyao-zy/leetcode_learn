package com.zy.leetcode;

import java.util.List;

/**
 * @author: zhangyao
 * @create: 2021-04-09 11:12
 * @Description: 两数相加
 **/
public class P2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode calc(ListNode listNode1, ListNode listNode2){
        return new ListNode(3);
    }


    public static void main(String[] args) {
        P2 p2 = new P2();
        ListNode listNode1 = p2.new ListNode(2);
        ListNode listNode2 = p2.new ListNode(3);
        ListNode calc = p2.calc(listNode1, listNode2);
        System.out.println(calc.val);
    }
}
