package String;

import java.sql.SQLSyntaxErrorException;

public class stringPool {
    public static void main(String[] args) {
        //Created inside heap ,inside string pool and duplicacy not allowed.
        //String heap: Hello.
        String s1="Hello";
        String s2="Hello";
        //Created inside heap and duplicacy is allowed.
        //Heap: Hello, Hello.
        String s3=new String("Hello");
        String s4=new String("Hello");
        //"=" sign compares address.
        System.out.println(s1==s3);
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        //During using concate method or plus sign then the content is first copied inside heap(in or out of pool) and then added.
        //New keyword is automatically applied and the new string is automatically used.
        s1=s1+" Bye";
        System.out.println(s1);
    }
}
