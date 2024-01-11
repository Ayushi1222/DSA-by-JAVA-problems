package Recursion;

import java.util.Scanner;

public class linearSearchByRecursion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a={9,6,8,7,5,4,3,9,2};
        int val=4;
        System.out.println(search(a,val,0));
    }

    public static int search(int[] a,int val,int i)
    {
        if(i>a.length-1)
            return -1;
        if(a[i]==val)
            return i;
        return search(a,val,i+1);
    }
}
