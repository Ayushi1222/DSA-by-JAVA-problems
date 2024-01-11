package String;

public class equals {
    public static void main(String[] args) {
        String s1="Hello";
        String s2=new String("Hello");
        System.out.print(s1.equals(s2));// from library/ class method.
        System.out.print(checkEquals(s1,s2));// without in built method.

    }
    public static boolean checkEquals(String s1, String s2)
    {
        if(s1==s2)
            return true;
        if(s1.length()!=s2.length())
            return false;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
                return false;
        }
        return true;
    }
}
