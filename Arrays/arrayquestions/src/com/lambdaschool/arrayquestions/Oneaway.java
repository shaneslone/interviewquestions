package com.lambdaschool.arrayquestions;

public class Oneaway {
    public boolean checker(String s1, String s2){
        int lenDiff = s1.length() - s2.length();
        if(lenDiff < -1 || lenDiff > 1){
            return false;
        }
        int[] charcount = new int[128];
        for(int i = 0; i < s1.length(); i++){
            charcount[s1.charAt(i)] += 1;
        }
        for(int i = 0; i <s2.length(); i++){
            if(charcount[s2.charAt(i)] > 0) {
                charcount[s2.charAt(i)] -= 1;
            }
        }
        int total = 0;
        for(int i = 0; i < 128; i++){
                total += charcount[i];
        }
        return total == 1;
    }
}
