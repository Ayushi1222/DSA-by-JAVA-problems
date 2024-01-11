package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Leader_in_Array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int[] b=new int[n];
        int max=0;
        for(int i=a.length-1;i>0;i--)
        {
            if(a[i]>max) {
                max = a[i];
                b[i] = a[i];
            }
        }
        Arrays.sort(b);
        for(int i=0;i<b.length;i++)
        {
                System.out.print(b[i]+" ");
        }

    }
//    public static int[] replaceElements(int[] arr) {
//        int max=0;
//        int[] b=new int[arr.length];
//        for(int i=arr.length-1;i>=0;i--)
//        {
//            if(i==arr.length-1)
//                b[arr.length-1]=-1;
//            if(arr[i]>max){
//                max=arr[i];
//            }
//            b[i]=max;
//        }
//        for(int i=0;i<arr.length-1;i++)
//        {
//            int temp=b[i];
//            b[i]=b[i+1];
//            b[i+1]=temp;
//        }
//        b[arr.length-1]=-1;
//        return b;
//    }
}
