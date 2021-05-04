package com.lambdaschool.recursionanddynamicprogramming;

public class Main{
    public static void main(String[] args) {
        System.out.println(threeStep(5));

    }

    private static int threeStep(int steps){
        int[] s = new int[steps+3];
        s[0] = 0;
        s[1] = 0;
        s[2] = 1;
        for(int i = 0; i < steps; i++){
            int cur = i+3;
            s[cur] = s[cur-1] + s[cur-2] + s[cur-3];
        }
        return s[s.length -1];
    }
}