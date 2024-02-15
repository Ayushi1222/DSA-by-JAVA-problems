package Recursion;

import java.util.Scanner;

public class powUsingTC {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=10;
        int n=5;
        System.out.println(pow(a,n));
    }

    public static int pow(int a,int n)
    {
        if(n==1)
            return a;
        int ans=pow(a,n/2);
        ans=ans*ans;
        if(n%2!=0)
        {
            ans*=a;
        }
        return ans;
    }
}
