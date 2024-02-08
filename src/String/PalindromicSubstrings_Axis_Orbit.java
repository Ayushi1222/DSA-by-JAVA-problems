package String;
import java.util.Scanner;
public class PalindromicSubstrings_Axis_Orbit {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        String st=s.next();
        System.out.println(palindromeString(st));
    }

    public static int palindromeString(String st)
    {
        //odd
        int odd=0;
        for(int axis=0;axis<st.length();axis++)
        {
            for(int orbit=0;axis-orbit>=0 && axis+orbit<st.length();orbit++)
            {
                if(st.charAt(axis-orbit)!=st.charAt(axis-orbit))
                    break;
                odd++;
            }
        }
        //even
        int even=0;
        for(double axis=0.5;axis<st.length();axis++)
        {
            for(double orbit=0.5;axis-orbit>=0 && axis+orbit<st.length();orbit++)
            {
                if(st.charAt((int)(axis-orbit))!=st.charAt((int)(axis-orbit)))
                    break;
                even++;
            }
        }
        return odd+even;
    }

}
