package String;

public class camelCase {
    public static void main(String[] args) {
        String s="IAmACompetitiveProgrammer";
        String st="";
        for(int i=0;i<s.length()-1;i++)
        {
            st+=s.charAt(i);
            if(!Character.isLowerCase(s.charAt(i+1)))
            {
                System.out.println(st);
                st="";
            }
            if(i==s.length()-2)
            {
                st+=s.charAt(i+1);
                System.out.println(st);
            }

        }
//------------------------------------------------------------------

//        String a="AyushiKatroliya";
//        int b=a.length();
//        int c=1;
//        System.out.print(a.charAt(0));
//        while(c<b)
//        {
//            int d=(int)a.charAt(c);
//            if(d>=65 && d<=90)
//            {
//                System.out.println();
//            }
//            System.out.print(a.charAt(c));
//            c++;
//        }
    }
}
