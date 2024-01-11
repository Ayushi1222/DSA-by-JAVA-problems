package BasicProgram;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int i=1;
        while(i++>0)
        {
            if(i%a==0 && i%b==0)
                break;
        }
        System.out.print(i);
    }
}
