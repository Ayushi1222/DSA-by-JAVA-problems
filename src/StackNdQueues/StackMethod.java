package StackNdQueues;

import java.util.Stack;

public class StackMethod {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.size());


    }
}