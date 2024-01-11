package Recursion;

import java.util.Scanner;

public class Nth_fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n)
    {
        if(n==0 || n==1)
            return n;
        int f1=fib(n-1);
        int f2=fib(n-2);
        return f1+f2;
    }
}
