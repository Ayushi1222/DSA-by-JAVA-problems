package BasicProgram;

import java.util.Scanner;

public class printArmstrongNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        while(n1!=n2)
        {
            boolean b=isArm(n1);
            if(b)
            {
                System.out.println(n1);
            }
            n1++;
        }
    }
    private static boolean isArm(int n)
    {
        int c=(int)(Math.log10(n)+1);
        int sum=0,r=0;
        int N=n;
        while(n>0)
        {
            r = n % 10;
            n = n / 10;
            sum += (Math.pow(r, c));
        }
        return N==sum;
    }
}