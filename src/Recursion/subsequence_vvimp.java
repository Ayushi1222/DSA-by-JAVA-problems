package Recursion;

import java.util.Scanner;

public class subsequence_vvimp {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        print(st,"");
    }

    public static void print(String st,String ans)
    {
        if(st.length()==0) {
            System.out.println(ans);
            return;
        }
        char ch=st.charAt(0);
        print(st.substring(1),ans);//not add
        print(st.substring(1),ans+ch);//add

    }
}
