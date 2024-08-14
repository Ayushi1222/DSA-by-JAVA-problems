package CodeForces;

import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int ans=0;
            String st=String.valueOf(n);
            int boring1=Integer.parseInt(String.valueOf(st.charAt(0)));
            ans=10*(boring1-1);
            int i=1;
            while(i<=st.length())
            {
                ans+=i;
                i++;
            }
            System.out.println(ans);
        }
    }
}
