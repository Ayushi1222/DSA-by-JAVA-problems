package Arrays;

import java.util.*;

public class lesserLeft_greaterRight {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int item=a[n-1];
        int i=0;
        int j=n-1;
        int pos=0;
        while(i<j)
        {
            if(a[i]<item)
            {
                int temp=a[i];
                a[i]=a[pos];
                a[pos]=temp;
                pos++;
            }
            i++;
        }
        int temp=a[j];
        a[i]=a[pos];
        a[pos]=temp;
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
