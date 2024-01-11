package String;

import java.util.Scanner;

public class CBnumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        int ans=check(s1);
        System.out.print(ans);
    }
    public static int check(String s1)
    {
        int c=0;
        boolean[] visited=new boolean[s1.length()];
        for(int i=1;i<=s1.length();i++)
        {
            for(int j=i;j<=s1.length();j++)
            {
                int a=j-i;
                String st=s1.substring(a,j);
                System.out.println(st);
                if(isCBNumber(Long.parseLong(st)) && isVisited(visited,a,j-1))
                {
                    c++;
                    for(int k=a;k<=j-1;k++)
                    {
                        visited[k]=true;
                    }
                }
            }
        }
        return c;
    }
    public static boolean isCBNumber(long n)
    {
        if(n==0 || n==1)
            return false;
        int[] arr={2,3,5,7,11,13,17,19,23,29};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
                return true;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(n%arr[i]==0)
                return false;
        }
        return true;
    }
    public static boolean isVisited(boolean[] visited, int si,int ei)
    {
        for(int i=si;i<=ei;i++)
        {
            if(visited[i]==true)
                return false;
        }
        return true;

    }
}
