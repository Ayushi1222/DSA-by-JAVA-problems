package twoDArray;

import java.util.Scanner;

public class transpose {
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
        transpose(arr);
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr[0].length;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}
