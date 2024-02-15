package Recursion;

import java.util.Random;

public class RandomizedQuickSort {
    public static void main(String[] args) {
        int[] a={5,7,2,1,8,3,4};
        quickSort(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }

    public static void quickSort(int[] a, int i, int j)
    {
        if(i>=j)
        {
            return;
        }
        int pos= partition(a,i,j);
        quickSort(a,i,pos-1);
        quickSort(a,pos+1,j);
    }

    public static int partition(int[] a,int i,int j)
    {
        //Random index generate karne se average case TC nlogn.
        Random rn=new Random();
        int ri=rn.nextInt((j-i+1)+i);
        System.out.println(ri);
        int t=a[ri];
        a[ri]=a[j];
        a[j]=t;
        int item=a[j];
        int pos=i;
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
        return pos;
    }
}
