package CodeForces;

import java.util.Scanner;

public class coinChange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y>=-1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
