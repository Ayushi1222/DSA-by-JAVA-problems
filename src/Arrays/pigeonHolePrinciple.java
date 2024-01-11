package Arrays;

import java.util.Scanner;

public class pigeonHolePrinciple {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++)
                arr[i] = scn.nextInt();
            System.out.println(subarraysDivByK(arr, n));
        }

    }

    public static long subarraysDivByK(long[] arr, int k) {
        long sum=0;
        long[] f=new long[k];
        f[0]=1;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
            int m= (int) (sum%k);
            if(m<0)
                m+=k;
            f[m]= f[m]+1;
        }
        long ans=0;
        for(int i=0;i<k;i++)
        {
            long p=f[i];
            ans+=(p*(p-1))/2;
        }
        return ans;
    }
}
