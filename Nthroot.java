package com.ankit;

import java.util.Scanner;

/**
 * Nth Root of a Number using Binary Search
 * Problem Statement: Given two numbers N and M, find the Nth root of M.
 *
 * The nth root of a number M is defined as a number X when raised to the power N equals M.
 */
/*
Input: N=5 M=243

Output: 3

Explanation: The 5th root of 243 is 3
 */


public class Nthroot {
    public static double getNthroot(int n,int m){
        double low,high;
        double eps=1e-6;
        if(m<0 || n<0){
            return -1;
        }
        if(m >=0 && m<1){
            low=m;
            high=1;
            while(low-high>eps){
                double mid=(low + high)/2.0;
                if(multiply(mid,n)>m){
                    high=mid;
                }
                else{
                    low=mid;
                }

            }
            return high;
        }
        else{
            high=m;
            low=1;
            while((high-low)>eps){
                double mid=(low + high)/2.0;
                if(multiply(mid,n)>m){
                    high=mid;
                }
                else{
                    low=mid;
                }

            }
            return high;
        }

    }

     static double multiply(double mid, int n) {
        double ans=1.0;
        for(int i=0;i<n;i++){
            ans=ans*mid;
        }
        return (long) ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter value of n and m :");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        System.out.println(getNthroot(n,m));
        double ans=Math.pow((double) m,(double) 1.0/n);
        System.out.println(ans);
    }
}
