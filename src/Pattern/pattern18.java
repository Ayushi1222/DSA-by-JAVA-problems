package Pattern;

import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int star = 1;
        int space = n/2;
        while (row <= n) {
            // space
            int i = 1;
            while (i <= space)
            {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            //Mirror
            // next row Prep
            if(row<=n/2)
            {
                space--;
                star+=2;
            }
            else
            {
                star -= 2;
                space++;
            }
            System.out.println();
            row++;
        }
    }
}
