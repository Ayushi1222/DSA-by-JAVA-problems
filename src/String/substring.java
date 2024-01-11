package String;

public class substring {
    public static void main(String[] args) {
        String s1="Hello";
        for(int i=0;i<s1.length();i++)
        {
            String s="";
            for(int j=i;j<s1.length();j++)
            {
                s+=s1.charAt(j);
                System.out.print(s+" ");
            }
            System.out.println();
        }

    }
}
