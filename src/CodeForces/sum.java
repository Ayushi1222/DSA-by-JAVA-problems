package CodeForces;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-->0)
        {
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            if(a+b==c || a+c==b || b+c==a)
            {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
