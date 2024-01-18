package Recursion;

import java.util.Scanner;

public class tower_of_hanoi {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //Number of movements in tower of hanoi = 2^n -1
        int n=s.nextInt();
        String src="A";
        String hlp="B";
        String des="C";
        towerOfHanoi(n,src,hlp,des);
    }

    public static void towerOfHanoi(int n,String src, String hlp,String des)
    {
        if(n==0)
            return;
        towerOfHanoi(n-1,src, des, hlp);
        System.out.println("Move "+n+"th disk from "+src+" to "+des);
        towerOfHanoi(n-1,hlp,src,des);
    }
}
