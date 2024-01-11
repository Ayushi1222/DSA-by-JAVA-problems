package Arrays;

import java.util.Scanner;

public class SumFromBothSides {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int sum1=a[0];
        int sum2=0;
        for(int i=1;i<n;i++)
        {
            if(sum2>sum1)
                sum1+=a[i];
                if (sum1 == sum2) {
                System.out.println(i+1);
                break;
            }
            if(sum2<sum1) {
                sum2 += a[n - 1 - i];
            }


        }
//        int sum1=0;
//        int sum2=0;
//        int x=0;
//        for(int i=0;i<n;i++)
//        {
//            sum1+=a[i];
//        }
//        for(int i=0;i<n;i++) {
//            sum1 -= a[i];
//            if (sum1 == sum2)
//                System.out.println(i);
//            sum2+=a[i];
//
//        }
    }
}
