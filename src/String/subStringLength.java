package String;

public class subStringLength {
    public static void main(String[] args) {
        String s1="Hello";
        sub_string(s1);

    }
    public static void sub_string(String s1)
    {
        for(int i=1;i<=s1.length();i++)
        {
            for(int j=i;j<=s1.length();j++)
            {
                int a=j-i;
                System.out.print(s1.substring(a,j)+" ");
            }
            System.out.println();
        }
    }
}
