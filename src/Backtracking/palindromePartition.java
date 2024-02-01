package Backtracking;

public class palindromePartition {
    public static void main(String[] args) {
        String ques="nitin";
        partition(ques,"");
    }

    public static void partition(String ques,String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=1;i<=ques.length();i++)
        {
            String st=ques.substring(0,i);
            if(isPalindrome(st)) {
                partition(ques.substring(i), ans + st + "|");
            }
        }
    }
    public static boolean isPalindrome(String st)
    {
        int i=0;
        int j=st.length()-1;
        while(i<j)
        {
            if(st.charAt(i)!=st.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
