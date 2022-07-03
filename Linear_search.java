package com.ankit;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
//        System.out.print("Enter the size of array : ");
//        Scanner in = new Scanner(System.in);
//        int n= in.nextInt();
//        int[] arr = new int [n];
//        System.out.println("Enter the elements of array: ");
//        for(int i=0;i<n;i++){
//            arr[i]= in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.print("Enter the element you want to find: ");
//        int target= in.nextInt();
//        int index=Linearsearch(arr,target);
//        System.out.println(index);
        char [] abbb={'a','b','z'};
       int k= abbb[0];
        System.out.println(k);
        String a="hkb";


    }

    static int Linearsearch(int[] arr,int key) {
        int loc=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==key){
                loc=i;
                break;
            }
        }
       return loc;
    }
}
