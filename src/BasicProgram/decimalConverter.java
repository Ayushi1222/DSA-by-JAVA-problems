package BasicProgram;

import java.util.Scanner;

public class decimalConverter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=0,sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum=sum+rem*((int)(Math.pow(2,i)));
            i++;
            n/=10;
        }
        System.out.print(sum);
    }
}
