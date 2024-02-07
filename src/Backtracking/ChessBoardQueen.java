package Backtracking;

import java.util.Scanner;

public class ChessBoardQueen {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean [][] board=new boolean[n][n];
        queen(board,n,0);
    }
    public static void queen(boolean[][] board, int tq,int row)
    {
        if(tq==0)
        {
            display(board);
            System.out.println();
            return;
        }
        for(int col=0;col<board[0].length;col++)
        {
            if (isItSafe(board, row, col))
            {
                board[row][col] = true;
                queen(board, tq-1,row+1);
                board[row][col] = false;
            }
        }
    }
    public static void display(boolean[][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==true)
                    System.out.print("Q");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
    }

    public static boolean isItSafe(boolean[][] board, int row, int col)
    {
        //up col
        int r=row;
        while(r>=0)
        {
            if(board[r][col]==true)
                return false;
            r--;
        }
        //left diagonal
        r=row;
        int c=col;
        while(r>=0 && c>=0)
        {
            if(board[r][c]==true)
                return false;
            r--;
            c--;

        }
        //right diagonal
        r=row;
        c=col;
        while(r>=0 && c<board[0].length)
        {
            if(board[r][c]==true)
                return false;
            r--;
            c++;

        }
        return true;
    }

}
