package twoDArray;

import java.util.*;
public class diagonalTransversal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int[][] arr=new int[m][n];
        int[] a=new int[m*n];
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        for(int d=0;d<m+n-1;d++)
        {
            int r=0;
            int c=0;
            if(d<n)
                c=d;
            else
            {
                c=n-1;
                r=d-n+1;
            }
            ArrayList<Integer> l=new ArrayList<>();
            while(r<m && c>=0)
            {
                l.add(arr[r][c]);
                r++;
                c--;
            }
            if(d%2==0)
                Collections.reverse(l);

            for(int i=0;i<l.size();i++)
            {
                a[k]=l.get(i);
                k++;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
