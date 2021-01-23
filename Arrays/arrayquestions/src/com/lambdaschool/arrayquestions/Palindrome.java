package com.lambdaschool.arrayquestions;

public class Palindrome {
    public boolean permutation(String s){
        int[] charCount = new int[128];
        for(int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            charCount[c] += 1;
        }
        int nonEven = 0;
        for(int i = 97; i < 123; i++){
            if(charCount[i] % 2 != 0){
                nonEven += 1;
            }
        }
        return nonEven <= 1;
    };
}
