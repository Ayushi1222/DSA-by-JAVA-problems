package twoDArray;

import java.util.*;

public class murthalParatha {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        int n=s.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        int lo=0;
        int hi=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(isPossible(arr,mid,p))
            {
                ans=Math.min(ans,mid);
                hi=mid-1;
            }
            else
                lo=mid+1;
        }
        System.out.print(ans);

    }
    public static boolean isPossible(int[] arr, int mid, int p)
    {
        for(int i=0;i<arr.length;i++)
        {
            int t=0;
            int c=1;
            while(t+c*arr[i]<=mid && p>0)
            {
                t+=c*arr[i];
                c++;
                p--;
            }
            if(p==0) return true;
        }
        return false;
    }
}
