package com.ankit;

import jdk.dynalink.beans.StaticClass;

import java.util.Arrays;

public class Searchin2darrays {
    public static void main(String[] args) {
        int [][] arr={
                {12, 23, 34, 45},
                {-2,-34,-90,111,112,114},
                {2333,456,4}
        };
        int target=4;
        System.out.println(Arrays.toString(Search2d(arr,target)));
    }

     static int[]  Search2d(int[][] arr,int target) {
        int [] k={-1,-1};
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    k[0]=i;
                    k[1]=j;
                    break;
                }
            }
        }
        return k;
    }

}
