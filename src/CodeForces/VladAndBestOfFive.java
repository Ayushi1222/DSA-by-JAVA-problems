package CodeForces;

import java.util.Scanner;

public class VladAndBestOfFive {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-->0)
        {
            String val=s.next();
            int ca=0;
            int cb=0;
            for(int i=0;i<val.length();i++)
            {
                if(val.charAt(i)=='A')
                    ca++;
                else cb++;
            }
            if(ca>cb)
                System.out.println("A");
            else
                System.out.println("B");
        }
    }
}
