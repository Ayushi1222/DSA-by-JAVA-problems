package Pattern;

import java.util.Scanner;

public class patternHourGlass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int row=1;
        int star=n;
        int space=1;
        while(row<=2*n+1)
        {
            //space
            int i=1;
            while(i<=space-1)
            {
                System.out.print("  ");
                i++;
            }
            //star
            int j=1;
            int a;
            if(row<=n)
                a=n-row+1;
            else a=row-(n+1);
            while(j<=star)
            {
                System.out.print(a-- +" ");
                j++;
            }
            int k=0;
            while(k<=star)
            {
                System.out.print(k+" ");
                k++;
            }
            //mirror
            if(row<=n)
            {
                star--;
                space++;
            }
            else
            {
                star++;
                space--;
            }
            row++;
            System.out.println();
        }
    }
}
