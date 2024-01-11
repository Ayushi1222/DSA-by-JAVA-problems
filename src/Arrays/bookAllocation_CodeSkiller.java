package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class bookAllocation_CodeSkiller {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int nos=in.nextInt();
        int[] pg= new int[n];
        for(int i=0;i<n;i++)
        {
            pg[i]=in.nextInt();
        }
        Arrays.sort(pg);
        int start=0;
        int end=0;
        for(int i=0;i<n;i++)
        {
            end+=pg[i];
        }
        int ans=0;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(check(pg, nos,mid))
            {
                ans=mid;
                end=mid-1;// kyuki ans minimise krna hai har bar
            }
            else
            {
                start=mid+1;
            }
        }
    }
    public static boolean check(int[] pg, int nos, int mid)
    {
        int s=1;
        int readpages=0;
        int i=0;
        while(i<pg.length)
        {
            if(readpages+pg[i]<=mid)
            {
                readpages+=pg[i];
                i++;
            }
            else
            {
                s++;
                readpages=0;
            }
            if(s==nos)
                return true;
        }
        return false;
    }
}
