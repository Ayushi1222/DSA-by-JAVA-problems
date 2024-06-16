package BasicProgram;

import java.util.Scanner;

public class sieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();// n tk ke saare prime
        sieve(n);
    }
    // false= prime
    // true = not prime
    //COMPLEXITY--> n*(log(log(n))-----Base 2
    public static void sieve(int n)
    {
        boolean[] b=new boolean[n+1];
        b[0]=true;
        b[1]=true;
        for(int i=2;i*i<=n+1;i++)
        {
            if(!b[i])
            {
                for(int j=2;i*j<n+1;j++)
                {
                    b[i*j]=true;
                }
            }
        }
        for(int i=0;i<n+1;i++)
        {
            if(!b[i])
                System.out.print(i+" ");
        }

    }
}
