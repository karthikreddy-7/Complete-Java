package Recursion_simple_advanced.easy;

import java.util.Scanner;

public class sumofN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of N:");
        int n=sc.nextInt();
        sumbyparamter(n,0);
        int sum=sumbyfunction(n);
        System.out.println("the sum of N by functional recursion is "+sum);
        sc.close();

    }

static void sumbyparamter(int n,int sum){
    if (n<1){
        System.out.println("the sum of N by paramterised recursion "+sum);
        return ;
    }
    sumbyparamter(n-1, n+sum);    
}

static int sumbyfunction(int n){
    if (n<1){
        return 0;
    }
    return n+sumbyfunction(n-1);
}
    
}
