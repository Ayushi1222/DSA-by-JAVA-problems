package twoDArray;

import java.util.Scanner;

public class piyushNdMagicalPark {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int k=in.nextInt();
        int s=in.nextInt();
        char [][] arr=new char[m][n];
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=in.next().charAt(0);
            }
        }
        int ans=escape(arr,k,s,m,n);
        if(ans==0) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
            System.out.println(ans);
        }

    }
    public static int escape(char[][] arr,int k,int s,int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(s<k)
                    return 0;
                if(j!=n-1 && arr[i][j]!='#')
                    s--;
                if(arr[i][j]=='.')
                    s-=2;
                else if(arr[i][j]=='*')
                    s+=5;
                else if(arr[i][j]=='#')
                    break;

            }
        }
        return s;
    }
}
