package CodeForces;

import java.util.Scanner;

public class clockConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            String st=sc.next();
            int num=Integer.parseInt(st.substring(0,2));
            if(num==0)
            {
                System.out.println("12"+st.substring(2)+" AM");
            }
            else if(num==12)
            {
                System.out.println(st+" PM");
            }
            else if(num<12)
            {
                System.out.println(st+" AM");
            }
            else
            {
                int val=num-12;
                String convert=val<10 ? "0"+String.valueOf(val):String.valueOf(val);
                System.out.println(convert+st.substring(2)+" PM");
            }
        }
    }
}

//-------Input
//11
//        09:41
//        18:06
//        12:14
//        00:59
//        00:00
//        14:34
//        01:01
//        19:07
//        11:59
//        12:00
//        21:37


//-------Output
//09:41 AM
//06:06 PM
//12:14 PM
//12:59 AM
//12:00 AM
//02:34 PM
//01:01 AM
//07:07 PM
//11:59 AM
//12:00 PM
//09:37 PM
