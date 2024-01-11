package Arrays;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        selectionSort(a);
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }
    public static void BubbleSort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void selectionSort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            int minpos=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[minpos]) {
                    minpos=j;
                }
            }
            System.out.println(Arrays.toString(a));
            int temp=a[i];
            a[i]=a[minpos];
            a[minpos]=temp;
        }
    }
    public static void insertionSort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            int temp=a[i];
            int x=i;
            for(int j=i-1;j>=0;j--)
            {
                if(temp<a[j])
                {
                    a[j+1]=a[j];
                    x=j;
                }
            }
            a[x]=temp;
        }
    }
//    INSERTION SORT EASY METHOD
//    int j = i - 1;
//    int item = arr[i];
//		while (j >= 0 && arr[j] > item) {
//        arr[j + 1] = arr[j];
//        j--;
//    }
//    arr[j + 1] = item;
    public static void countingSort(int[] a)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            max=Math.max(a[i],max);
        }
        int[] b= new int[max+1];
        for(int i=0;i<a.length;i++)
        {
            b[a[i]]++;
        }
        int j=0;
        for(int i=0;i<b.length;i++)
        {
            while(b[i]>0)
            {
                a[j]=i;
                b[i]--;
                j++;
            }
        }
    }

}
