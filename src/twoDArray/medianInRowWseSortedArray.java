package twoDArray;

import java.util.Scanner;

public class medianInRowWseSortedArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int[][] a=new int  [m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.print(median(a,m,n));
    }
    public static int median(int[][] a, int m,int n)
    {
        int maxe=Integer.MIN_VALUE;
        int mine=Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            if(a[i][0]<mine)
                mine=a[i][0];
            if(a[i][n-1]>maxe)
                maxe=a[i][n-1];
        }
        int req=(n*m)/2;
        while(mine<=maxe)
        {
            int mid=(mine+maxe)/2;
            int smallerEquals= smallerEquals(a,m,n,mid);
            if(smallerEquals<=req)
                mine=mid+1;
            else
                maxe=mid-1;
        }
        return mine;
    }
    public static int smallerEquals(int[][] a,int m,int n,int mid)
    {
        int c=0;
        for(int i=0;i<m;i++)
        {
            c+=upperBound(a[i],n,mid);
        }
        return c;
    }
    public static int upperBound(int[] a,int n,int mid)
    {
        int lo=0;
        int hi=n-1;
        int up=n;
        while(lo<=hi)
        {
            int mid2=(lo+hi)/2;
            if(a[mid2]>mid) {
                up = mid2;
                hi=mid2-1;
            }
            else
                lo=mid2+1;
        }
        return up;
    }

}
