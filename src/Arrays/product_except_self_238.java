package Arrays;

import java.util.Scanner;

public class product_except_self_238 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        product(a);
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }
    public static int[] product(int[] a)
    {
        int n=a.length;
        int[] left= new int[n];
        left[0]=1;
        for(int i=1;i<n;i++)
        {
            left[i]=left[i-1]*a[i-1];
        }
        int[] right=new int[n];
        right[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]*a[i+1];
        }
        for(int i=0;i<n;i++)
        {
            a[i]=left[i]*right[i];
        }
        return a;
    }
}
