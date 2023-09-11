package Recursion_simple_advanced.easy;

import java.util.Scanner;

//printing 1 to N using recursion by backtracking:
public class printingbyBackTracking {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of N: ");
        int n=sc.nextInt();
        print(n,n);
        System.out.println();
        endprint(1,n);
        sc.close();
    }

    static void print(int i,int n){
        if (i<1){
            return ;
        }
        print(i-1,n);
        System.out.print(i+" ");
    }

    //printing from N to 1:
    static void endprint(int i,int n){
        if (i>n){
            return ;
        }
        endprint(i+1,n);
        System.out.print(i+" ");
    }
    
}
