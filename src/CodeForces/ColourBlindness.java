package CodeForces;

import java.util.Scanner;

public class ColourBlindness {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            String st=s.next();
            String st2=s.next();
            int f=1;
            for(int i=0;i<n;i++)
            {
                if((st.charAt(i)=='R' && st2.charAt(i)=='B')|| (st.charAt(i)=='R' && st2.charAt(i)=='G') ||(st.charAt(i)=='B' && st2.charAt(i)=='R')|| (st.charAt(i)=='G' && st2.charAt(i)=='R'))
                    f=0;
            }
            if(f==0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
