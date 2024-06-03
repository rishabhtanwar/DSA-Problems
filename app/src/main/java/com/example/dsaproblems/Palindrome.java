package com.example.dsaproblems;

public class Palindrome {

    public static void main(String[] args){
        String s = "abcdcba";
        int left =0;
        int right = s.length()-1;
        boolean status = true;
        while(left<right){
            if (s.charAt(left)!=s.charAt(right)){
                status = false;
            }
            left++;
            right--;
        }
        if (!status){
            System.out.println("String is not a palindrome");
        }else {
            System.out.println("String is a palindrome");
        }
    }
}
