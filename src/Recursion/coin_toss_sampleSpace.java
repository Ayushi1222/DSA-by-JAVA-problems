package Recursion;

import java.util.Scanner;

public class coin_toss_sampleSpace {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        print(n,"");
    }

    public static void print(int n,String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
        print(n-1,ans+"H");
        print(n-1,ans+"T");
    }
}
