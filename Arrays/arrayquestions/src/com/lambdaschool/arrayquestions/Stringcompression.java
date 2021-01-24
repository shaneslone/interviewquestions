package com.lambdaschool.arrayquestions;

public class Stringcompression {
    public String compressor(String s){
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;
        for (int i =0;i < s.length(); i ++){
            countConsecutive ++;
            if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)){
                compressed.append(s.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.length() < s.length() ? compressed.toString() : s;
    }
}
