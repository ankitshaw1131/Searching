package com.ankit;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        /**
         * Converting String into an array of character
         */
//        String ank="baba aaya samjha kya";
//        char[] bbb = ank.toCharArray();
//        System.out.println(Arrays.toString(bbb));
        /**
         * code to show the error of finding max element in an array when we initialise max value with 0
         */
        int [] num={-1,-2,-3};
//        int max=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i< num.length;i++){
            if(num[i]> max)
                max=num[i];
        }
        System.out.println(max);
    }
}
