package Pattern;

import java.util.Scanner;

public class patternDoubleSidedArrow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int space = n - 1;
        int star = 1;
        int in_space = 0;
        while (row <= n) {
            //space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            //star
            int j = 1;
            int a=0;
            if(row<=n/2+1)
                a=row;
            else a=n-row+1;
            while (j <= star) {
                System.out.print(a--+" ");
                j++;
            }
            int k = 2;
            while (k <= in_space) {
                System.out.print("  ");
                k++;
            }
            int l = 1;
            int b=1;
            while (l <= star) {
                if (row == 1 || row==n)
                    System.out.print("");
                else System.out.print(b++ +" ");
                l++;
            }
            //mirror
            if (row <= n / 2) {
                space -= 2;
                star++;
                in_space += 2;
            }
            else {
                space += 2;
                star--;
                in_space -= 2;
            }
            row++;
            System.out.println();
        }
    }
}