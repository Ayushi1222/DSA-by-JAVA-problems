package Recursion;

import java.util.Scanner;

public class lexicographicalNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        lexicoPrint(n,0);
    }

    public static void lexicoPrint(int n,int ans)
    {

        if(ans>n)
            return;
        System.out.print(ans+" ");
        int i=0;
        if(ans==0)
            i=1;
        for(;i<=9;i++)
        {
            lexicoPrint(n,ans*10+i);

        }
    }
}
