package Pattern;

import java.util.Scanner;

public class pattern28_mirror {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=0;
        for(int i=1;i<=2*n-1;i++)
        {
            if(i<=n)
            {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(++a + " ");
                }
                for (int j = 1; j < i; j++) {
                    System.out.print(--a + " ");
                }
            }
            else
            {
                for (int j = 1; j <= i-n; j++)
                {
                    System.out.print("  ");
                }
                int b = 2*n-i-1;
                for (int j = 1; j <=2*n-i; j++)
                {
                    System.out.print(++b + " ");
                }
                for (int j = 1; j <2*n-i; j++)
                {
                    System.out.print(--b + " ");
                }
            }
            System.out.println();
        }
    }
}
