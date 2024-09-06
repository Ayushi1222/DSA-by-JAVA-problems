package BinarySearch;

import java.util.*;

public class AggresiveCow {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int c=in.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int start=1;
        int end=arr[n-1]-arr[0];// kyuki agr starting ending mai bht jyda difference hua to kaise binary search doondhega
        int ans=0;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(check(arr,mid,c))
            {
                ans=mid;
                start=mid+1;// kyuki ans ko maximise karna hai, isliye firse check krege!
            }
            else
            {
                end=mid-1;
            }
        }
        System.out.print(ans);
    }
    public static boolean check(int[] arr, int mid, int c)
    {
        int j=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-j>=mid)
            {
                count++;
                j=arr[i];
            }
            if(c==count)
                return true;
        }
        return false;
    }
}
