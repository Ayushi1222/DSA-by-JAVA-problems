package Arrays;

import java.util.Scanner;

public class maxElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println(max(a));
    }
    public static int max(int[] a ) {
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++)
        {
            if(a[i]>m)
                m=a[i];
        }
        return m;
    }
}
