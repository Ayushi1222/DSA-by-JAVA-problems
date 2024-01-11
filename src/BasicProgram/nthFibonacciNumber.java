package BasicProgram;

import java.util.Scanner;

public class nthFibonacciNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int a=0,b=1,sum=0;
        while(i!=n)
        {
            sum=a+b;
            a=b;
            b=sum;
            i++;
        }
        System.out.print(sum);
    }
}
