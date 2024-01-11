package Pattern;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row=1;
        int star=n/2;
        int space=1;
        while(row<=n)
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
            while(k<=star)
            {
                System.out.print("* ");
                k++;
            }
            //next row prep
            //mirror
            if(row<=(n/2))
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
