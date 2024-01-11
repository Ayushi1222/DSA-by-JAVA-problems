package twoDArray;

import java.util.Scanner;

public class wave_rowWise_print {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        int row=0;
        while(row<m)
        {
            if(row%2==0)
            {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[row][i] + ", ");
                }
            }
            else
            {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(arr[row][i] + ", ");
                }
            }
            row++;
        }
        System.out.print("END");
    }
}