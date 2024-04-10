package StackNdQueues;

import java.util.Stack;

public class Daily_Temp_Stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int[] arr={30 ,35 ,40 ,38 ,35};
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]>arr[st.peek()])
                st.pop();
            if(!st.isEmpty())
                ans[i]= i-st.peek();
            else
                ans[i]=i+1;
            st.push(i);
        }
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");
    }
}
