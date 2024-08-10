package CodeForces;

import java.util.Scanner;

public class StairPeek {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-->0)
        {
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            if(a<b && b<c)
                System.out.println("STAIR");
            else if(a<b && b>c)
                System.out.println("PEAK");
            else
                System.out.println("NONE");
        }
    }
}
