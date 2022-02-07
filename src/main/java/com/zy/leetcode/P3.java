package com.zy.leetcode;

import java.util.HashMap;

/**
 * @Author: Zy
 * @Date: 2022/2/7 10:49
 */
public class P3 {
    public static boolean isPalindrome(int x) {
        // 排除边界
        if(x==0){
            return true;
        }
        if(x%10==0 || x<0){
            return false;
        }
        // 获取数字的长度
        int length = 1;
        while(x/length>=10){
            length*=10;
        }

        // 循环判断首尾数字
        while(x>0){
            int left = x/length;
            int right = x%10;
            if(left!=right){
                return false;
            }
            x=(x%length)/10;
            length/=100;
            HashMap<Character, Integer> map = new HashMap<Character, Integer>(7);

        }
        return true;
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(121);
    }
}
