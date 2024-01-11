package Arrays;

import java.util.Scanner;

public class reverseInRange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int z=s.nextInt();
        int y=s.nextInt();
        reverse(a,z,y);
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }
    public static void reverse(int[] a,int z,int y)
    {
        int i=z;
        int j=y;
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
}
