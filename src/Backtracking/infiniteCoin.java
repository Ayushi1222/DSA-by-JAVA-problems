package Backtracking;
import java.util.*;
public class infiniteCoin {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int[] a=new int[n];
//        for(int i=0;i<n;i++)
//            a[i]=s.nextInt();
//        int amount=s.nextInt();
        int[] a={1,3,5};
        int amount =6;
//        coinCombination(a,amount,"",0);
        coinPermutation(a,amount,"");

    }

    public static void coinPermutation(int[] a,int amount,String ans)
    {
        if(amount==0)
        {
            System.out.println(ans);
            return;
        }
        System.out.println(ans);
        for(int i=0;i<a.length;i++)
        {
            if(amount>=a[i]) {
                coinPermutation(a, amount - a[i], ans + a[i]);
            }
        }
    }

    public static void coinCombination(int[] a,int amount,String ans, int idx)
    {
        if(amount==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<a.length;i++)
        {
            if(amount>=a[i]) {
                coinCombination(a, amount - a[i], ans + a[i],i);
            }
        }
    }
}
