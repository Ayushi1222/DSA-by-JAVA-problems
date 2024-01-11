package BasicProgram;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int dividend=s.nextInt();
        int divisor=s.nextInt();
        int rem=0;
        while(dividend % divisor!=0)
        {
            rem=dividend%divisor;
            dividend=divisor;
            divisor=rem;
        }
        System.out.println(rem);
    }
}
