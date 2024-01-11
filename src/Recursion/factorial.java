package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(fac(n));
        System.out.println(facByTail(n,1));
    }
    public static int fac(int n)
    {
        if(n==0)
            return 1;
        int f=fac(n-1);
        return n*f;
    }

    public static int facByTail(int n,int ans)
    {
        if(n==0)
            return ans;
        return facByTail(n-1,ans*n);
    }
}
