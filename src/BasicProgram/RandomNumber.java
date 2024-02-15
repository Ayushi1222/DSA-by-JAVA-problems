package BasicProgram;

import java.awt.desktop.SystemSleepEvent;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int si=10;
        int ei=100;
        Random rn=new Random();
        for(int i=0;i<10;i++)
        {
            int val=rn.nextInt((ei-si+1)+si);
            System.out.println(val);
        }
    }
}
