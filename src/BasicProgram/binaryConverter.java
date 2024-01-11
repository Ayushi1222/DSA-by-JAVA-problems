package BasicProgram;

import java.util.Scanner;

public class binaryConverter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rem=0,mul=1,sum=0;
        while(n>0)
        {
            rem=n%2;
            sum=sum+rem*mul;
            n/=2;
            mul=mul*10;
        }
        System.out.print(sum);
    }
}
