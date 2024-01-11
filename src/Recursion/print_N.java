package Recursion;

import java.util.Scanner;

public class print_N {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        print_dec(n);
        print_inc(n);

    }
    public static void print_dec(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        print_dec(n-1);
    }

    public static void print_inc(int n)
    {
        if(n==0)
            return;
        print_inc(n-1);
        System.out.println(n);
    }
}
