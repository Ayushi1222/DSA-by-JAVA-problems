package Pattern;

import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n -1- i; j++)
            {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++)
            {
                if(j%2!=0)
                    System.out.print("  ");
                else System.out.print("* ");
            }
            for (int j = 0; j < i; j++)
            {
                if(j%2!=0)
                    System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}
