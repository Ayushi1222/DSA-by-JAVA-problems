package Recursion;

import java.util.Scanner;

public class count_subsequence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        System.out.print(count(st,""));
//        System.out.println(c);
    }
    //Method 2
    public static int count(String st,String ans)
    {
        if(st.length()==0) {
            System.out.println(ans);
            return 1;
        }
        char ch=st.charAt(0);
        int a=count(st.substring(1),ans);//not add
        int b=count(st.substring(1),ans+ch);//add
        return a+b;
    }

    //Method 1
    static int c=0;
    public static void print(String st,String ans)
    {
        if(st.length()==0) {
            System.out.println(ans);
            c++;
            return;
        }
        char ch=st.charAt(0);
        print(st.substring(1),ans);//not add
        print(st.substring(1),ans+ch);//add

    }
}
