package Recursion;

public class boardPath_dice {
    public static void main(String[] args) {
        int n=4;
        printPath(n,0,"");
    }
    public static void printPath(int n,int c,String ans)
    {
        if(c==n)
        {
            System.out.println(ans);
            return;
        }
        if(c>n)
            return;
        for(int i=1;i<=3;i++)
        printPath(n,c+i,ans+i);
//        printPath(n,c+2,ans+2);
//        printPath(n,c+3,ans+3);
    }
}
