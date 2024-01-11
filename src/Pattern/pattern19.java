package Pattern;

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row=1;
        int star=n;
        int space=-1;
        while(row<=2*n-1)
        {
            //star
            int i=1;
            while(i<=star)
            {
                System.out.print("* ");
                i++;
            }
            //space
            int j=1;
            while(j<=space)
            {
                System.out.print("  ");
                j++;
            }
            //star
            int k=1;
            if(row==1 || row==2*n-1)
                k=2;
            while(k<=star)
            {
                System.out.print("* ");
                k++;
            }
            //next row prep
            //mirror
            if(row<n)
            {
                star--;
                space+=2;
            }
            else
            {
                star++;
                space-=2;
            }
            row++;
            System.out.println();
        }
    }
}
