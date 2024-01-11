package Arrays;

import java.util.Scanner;

public class maxSubArray {
    public static void main(String[] args) {
//        int[] a={5,4,-1,7,8};
        int[] a={-6,-9,-3,-7};
//        System.out.println(max_subarray(a));
        System.out.println(Kadanes_algo(a));
    }
    public static int Kadanes_algo(int[] a)
    {
        int max_sum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            max_sum=Math.max(sum,max_sum);
            if(sum<0)
                sum=0;
        }
        return max_sum;
    }
    public static int max_subarray(int[] a)
    {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];
                max_sum = Math.max(sum, max_sum);
                if(sum<0)
                    sum=0;
            }
        }
        return max_sum;
    }
}
