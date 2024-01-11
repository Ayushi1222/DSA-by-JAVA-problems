package Pattern;

import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            for (int j = 1; j <= 2*n-(2*i+1); j++)
            {
                System.out.print("  ");
            }
            for (int j = i; j >=1; j--)
            {
                if(j==n) {
                    System.out.print("");
                }
                else System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
