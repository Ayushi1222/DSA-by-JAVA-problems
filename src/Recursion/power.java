package Recursion;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int n=s.nextInt();
        System.out.println(pow(a,n));
    }

    public static int pow(int a,int n)
    {
        if(n==0)
            return 1;
        int p=pow(a,n-1);
        return a*p;
    }
}
