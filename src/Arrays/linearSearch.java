package Arrays;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int val=s.nextInt();
        System.out.println(search(a,val));
    }
    public static int search(int[] a,int val)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==val)
            return i;
        }
        return -1;
    }
}
