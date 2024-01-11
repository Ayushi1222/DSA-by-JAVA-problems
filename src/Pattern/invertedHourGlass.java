package Pattern;

import java.util.Scanner;

public class invertedHourGlass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int row=1;
        int space=2*n-1;
        int star=1;
        while(row<=2*n+1)
        {
            //star
            int i=1;
            int a=n;
            while(i<=star)
            {
                System.out.print(a--+" ");
                i++;
            }
            //space
            int j=1;
            while(j<=space)
            {
                System.out.print("  ");
                j++;
            }
            int k=1;
            int b=0;
            if(row<n+1)
                b=n-row+1;
            else if(row==n+1)
                b=n-row+2;
            else b=row-(n+1);
            while(k<=star)
            {
                if(k==n+1)
                    System.out.print("");
                else System.out.print(b++ +" ");
                k++;
            }
            //mirror
            if(row<=n)
            {
                star++;
                space-=2;
            }
            else
            {
                star--;
                space+=2;
            }
            row++;
            System.out.println();
        }
    }
}
