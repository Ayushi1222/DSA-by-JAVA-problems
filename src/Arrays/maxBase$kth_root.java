package Arrays;

import java.util.Scanner;

public class maxBase$kth_root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(maxBaseWithBinary(k,n));
        System.out.println(maxBase(k,n));
    }
    public static int maxBase(int k,int n)
    {
        int i=1;
        while(true)
        {
            int a=(int)Math.pow(i,k);
            if(a==n) {
                return i;
            }
            else if(a>n)
            {
                return i-1;
            }
            i++;
        }
    }
    public static int maxBaseWithBinary(int k,int n)
    {
        int strt=0;
        int end=n;
        int ans=0;
        while(strt<=end)
        {
            int mid=(strt+end)/2;
            if((int)Math.pow(mid,k)<=n)
            {
                ans=mid;
                strt=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}
