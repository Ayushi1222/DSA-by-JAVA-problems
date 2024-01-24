package Recursion;

import java.util.Scanner;

public class createPermutation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        permutation2(st,"");

    }

    public static void permutation2(String st, String ans)
    {
        if(st.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            boolean val=false;
            for(int j=i+1; j<st.length();j++)
            {
                if(ch==st.charAt(j))
                {
                    val=true;
                    break;
                }
            }
            if(val==false)
            {
                String s1=st.substring(0,i);
                String s2=st.substring(i+1);
                permutation2(s1+s2,ans+st.charAt(i));
            }

        }

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
