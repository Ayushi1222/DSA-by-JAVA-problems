package DP;
//Geek wants to climb from the 0th stair to the (n-1)th stair. At a time the Geek can climb either one or two steps.
// A height[N] array is also given. Whenever the geek jumps from stair i to stair j,
// the energy consumed in the jump is abs(height[i]- height[j]), where abs() means the absolute difference.
// return the minimum energy that can be used by the Geek to jump from stair 0 to stair N-1.


public class Frog_Jump {
    public static void main(String[] args) {
        int[] arr={30,10,60,10,60,50};
//        System.out.println(recursion(arr,arr.length-1));
        int[] dp=new int[arr.length];
//        System.out.println(memo(arr,arr.length-1,dp));
//        System.out.println(tab(arr,dp));
        System.out.println(space(arr));
    }
    private static int recursion(int[] arr,int i)
    {
        if(i==0) return 0;
        int jumpone=recursion(arr,i-1)+Math.abs(arr[i]-arr[i-1]);
        int jumptwo=Integer.MAX_VALUE;
        if(i>1)
        {
            jumptwo=recursion(arr,i-2)+Math.abs(arr[i]-arr[i-2]);
        }
        return Math.min(jumpone,jumptwo);
    }

    private static int memo(int[] arr,int i,int [] dp)
    {
        if(i==0) return 0;
        if(dp[i]!=0) return dp[i];
        int jumpone=recursion(arr,i-1)+Math.abs(arr[i]-arr[i-1]);
        int jumptwo=Integer.MAX_VALUE;
        if(i>1)
        {
            jumptwo=recursion(arr,i-2)+Math.abs(arr[i]-arr[i-2]);
        }
        return dp[i]=Math.min(jumpone,jumptwo);
    }

    private static int tab(int[] arr,int [] dp)
    {
        dp[0]=0;
        for(int i=1;i<arr.length;i++)
        {
            int jumpone=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            int jumptwo=Integer.MAX_VALUE;
            if(i>1)
                jumptwo=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
            dp[i]=Math.min(jumpone,jumptwo);
        }
        return dp[arr.length-1];
    }

    private static int space(int[] arr)
    {
        int prev1=0;
        int prev2=0;
        for(int i=1;i<arr.length;i++)
        {
            int jumpone=prev1+Math.abs(arr[i]-arr[i-1]);
            int jumptwo=Integer.MAX_VALUE;
            if(i>1)
                jumptwo=prev2+Math.abs(arr[i]-arr[i-2]);
            int curr=Math.min(jumpone,jumptwo);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
