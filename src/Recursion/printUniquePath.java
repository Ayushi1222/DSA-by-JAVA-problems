package Recursion;

import java.util.Scanner;

public class printUniquePath {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        UniquePath(m,n,1,1,"");
    }

    public static void UniquePath(int m,int n,int row,int col,String ans)
    {
        if(row==m && col==n)
        {
            System.out.println(ans);
            return;
        }
        if(row>m || col>n)
            return;
        UniquePath(m,n,row+1,col,ans+"V");
        UniquePath(m,n,row,col+1,ans+"H");
        UniquePath(m,n,row+1,col+1,ans+"D");
    }
}


