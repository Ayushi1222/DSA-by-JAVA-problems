package Backtracking;

public class Queen {
    public static void main(String[] args) {
        int n=4;//no. of boards
        int tq=2;//total queen
        boolean[] board = new boolean[n];
        permutation(board, tq,0,"");
    }

    public static void permutation(boolean[] board, int tq, int qpsf, String ans)  //qpsf=queen placed so far.
    {
        if(tq==qpsf)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i< board.length;i++)
        {
            if(board[i]==false)
            {
                board[i]=true;//placed queen
                permutation(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
                board[i]=false;//remove queen undo
            }
        }
    }
    //recursion only undo the arguments changed before its call.
    //Array make changes on the same location.
}
