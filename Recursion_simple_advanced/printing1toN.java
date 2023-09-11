package Recursion_simple_advanced;

import java.util.Scanner;

public class printing1toN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number N: ");
        int n=sc.nextInt();
        int z=1;
        beginprint(z,n);
        System.out.println();
        endprint(n);
        sc.close();
    }
    static void beginprint(int z,int n){
        if (z==n+1)
        {
            return ;

        }
        System.out.print(z+" ");
        beginprint(z+1,n);
    }
    static void endprint(int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");
        endprint(n-1);
    }
    
}
