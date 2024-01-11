package String;

public class stringPalindrome {
    public static void main(String[] args) {
        String s1="nitin";
        int c=1;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s1.charAt(s1.length()-i-1)) {
                c = 0;
                break;
            }
        }
        if(c==1)
        System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
