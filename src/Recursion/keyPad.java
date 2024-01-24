package Recursion;

public class keyPad {
    static String[] s={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String ques="23";
        map(ques,"");

    }
    public static void map(String ques, String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);//2
        String press=s[ch-'0'];//abc
        for(int i=0;i<press.length();i++)
            map(ques.substring(1),ans+press.charAt(i));
    }
}
