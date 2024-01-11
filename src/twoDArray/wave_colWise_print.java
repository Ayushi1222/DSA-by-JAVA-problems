package twoDArray;

import java.util.Scanner;

public class wave_colWise_print {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int [][] arr=new int[m][n];
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        int col=0;
        while(col<n)
        {
            if(col%2==0)
            {
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[col][i] + ", ");
                }
            }
            else
            {
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[col][i] + ", ");
                }
            }
            col++;
        }
        System.out.print("END");

    }
}
