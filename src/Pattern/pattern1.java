package Pattern;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
//        for(int i=0;i<n;i++)
//        {
//            for (int j = 0; j < n; j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        int row=0;
        while(row<n)
        {
            int i=0;
            while(i<n)
            {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
