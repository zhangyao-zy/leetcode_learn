package com.zy.leetcode;

/**
 * @Author: Zy
 * @Date: 2022/2/9 9:09
 * 字符串公共前缀求解
 */
public class P4 {
    /**
     * 横向比较
     * @author Zy
     * @date 2022/2/9
     * @param strs
     * @return java.lang.String
     */
    public static String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        String prefix = strs[0];
        for (int i = 1; i < length; i++) {
            String tempStr = strs[i];
            int min = Math.min(prefix.length(), tempStr.length());
            for (int j = 0; j < min; j++) {
                char c = prefix.charAt(j);
                char c1 = tempStr.charAt(j);
                if (prefix.length() - 1 > j && c!=c1) {
                    prefix = tempStr.substring(0, j);
                    break;
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flow","flower","flight"};
        longestCommonPrefix(strs);
    }
}
