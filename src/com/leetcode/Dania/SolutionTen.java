package com.leetcode.Dania;
//check if the String is palindrom :)
public class SolutionTen {
    public static boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}
