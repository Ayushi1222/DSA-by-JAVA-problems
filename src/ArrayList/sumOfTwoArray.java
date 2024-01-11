package ArrayList;

import java.util.*;
public class sumOfTwoArray {
    public static void main (String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a1=new int[n];
        for(int i=0;i<n;i++)
        {
            a1[i]=s.nextInt();
        }
        int m=s.nextInt();
        int[] a2=new int[m];
        for(int i=0;i<m;i++)
        {
            a2[i]=s.nextInt();
        }
        sum(a1,a2);
    }
    public static void sum(int[] a1, int[] a2)
    {
        ArrayList<Integer> l=new ArrayList<>();
        int i=a1.length-1;
        int j=a2.length-1;
        int c=0;
        while(i>=0 && j>=0)
        {
            int sum = c + a1[i] + a2[j];
            l.add(sum%10);
            c=sum/10;
            i--;
            j--;
        }
        //Any one out of these two loops will run as earlier loop will stop
        // as soon as one of the index is negative it will stop and rest left
        // elements of bigger array is added through this any one loop.
        while(i>=0)
        {
            int sum = c+ a1[i];
            l.add(sum%10);
            c=sum/10;
            i--;
        }
        while(j>=0)
        {
            int sum = c+ a2[j];
            l.add(sum%10);
            c=sum/10;
            j--;
        }
        if(c>0)
            l.add(c);
        for(int k=l.size()-1;k>=0;k--)
        {
            System.out.print(l.get(k)+", ");
        }
        System.out.print("END");
    }
}
