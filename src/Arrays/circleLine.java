package Arrays;

import java.util.Scanner;

public class circleLine {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int x=s.nextInt();
        int y=s.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=x-1;i<=y-1;i++)
        {
            sum1+=a[i];
        }
    }
}
