package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueBidAuction {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=s.nextInt();
            }
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            }
            int mine=Integer.MAX_VALUE;
            int idx=-1;
            for(int i=0;i<n;i++)
            {
                if(map.get(arr[i])==1)
                {
                    if(arr[i]<mine)
                    {
                        mine=arr[i];
                        idx=i+1;
                    }
                }
            }
            if(arr.length==1) System.out.println(arr[0]);
            else System.out.println(idx);
        }
    }
}

//-1
//        2
//        4
//        1
//        2
//        -1

