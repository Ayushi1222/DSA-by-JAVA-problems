package BasicProgram;

import java.util.Scanner;

public class printSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int c=0,i=1;
        while(c!=n1)
        {
            if((3*i+2)%n2!=0)
            {
                System.out.println(3*i+2);
                c++;
            }
            i++;
        }
    }
}
