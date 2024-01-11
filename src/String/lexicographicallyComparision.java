package String;

public class lexicographicallyComparision {
    public static void main(String[] args) {
        String s1="Ayushi";
        String s2="Ayush";
        System.out.println(s1.compareTo(s2));// from library/ class method.
        System.out.println(compareto(s1,s2));// without in built method.

    }
    public static int compareto(String s1, String s2)
    {
        for(int i=0;i<Math.min(s1.length(),s2.length());i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
                return s1.charAt(i)-s2.charAt(i);

        }
       return s1.length()-s2.length();
    }
}
