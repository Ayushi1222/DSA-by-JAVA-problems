package Pattern;

import java.util.Scanner;
public class fibonacci_pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0,a=1,b=1;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
                System.out.print("0 ");
            else if(i==2)
                System.out.print(a+" "+b);
            else
            {
                for (int j = 0; j < i; j++) {
                    sum = a + b;
                    a = b;
                    b = sum;
                    System.out.print(sum + " ");
                }
            }
            System.out.println();
        }
    }
}

