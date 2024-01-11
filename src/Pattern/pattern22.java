package Pattern;

import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = n-i; j >0; j--)
            {
                System.out.print("* ");
            }
            for (int j = 0; j < 2*i-1; j++)
            {
                if(j==0)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            for (int j = n-i; j >=0; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
