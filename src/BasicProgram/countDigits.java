package BasicProgram;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=s.nextInt();
        int ct=0;
        while(n>0)
        {
            int r=n%10;
            if(r==c)
                ct++;
            n/=10;
        }
        System.out.println(ct);
//        String s1=String.valueOf(n);
//        char s2=(char)(c);
//        for(int i=0;i<s1.length();i++)
//        {
//            if(s1.charAt(i)==(s2))
//            {ct++;}
//        }
//        System.out.println(ct);
//        System.out.println(s1.charAt(4)==(s2));
    }
}
