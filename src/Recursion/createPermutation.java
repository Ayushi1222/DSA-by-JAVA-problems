package Recursion;

import java.util.Scanner;

public class createPermutation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        permutation(st,"");

    }

    public static void permutation(String st, String ans)
    {
        if(st.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<st.length();i++)
        {
            String s1=st.substring(0,i);
            String s2=st.substring(i+1);
            permutation(s1+s2,ans+st.charAt(i));
        }

    }
}
