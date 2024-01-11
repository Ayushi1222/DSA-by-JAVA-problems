package Pattern;

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
//        int row=1;
//        int star=1;
//        while(row<=2*n-1)
//        {
//            //star
//            int i=1;
//            while(i<=star)
//            {
//                System.out.print("* ");
//                i++;
//            }
//            //next row prep
//            // Mirror
//            if(row<n)
//            star++;
//            else star--;
//            row++;
//            System.out.println();
//        }
        for(int i=1;i<=2*n-1;i++)
        {
            if(i<=n)
            {
                for (int j = 0; j < i; j++)
                        System.out.print("* ");
            }
            else
            {
                for(int j=0;j<2*n-i;j++)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
