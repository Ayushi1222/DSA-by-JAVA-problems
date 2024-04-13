package StackNdQueues;
import java.lang.Exception;
public class Stack {
    private int[] arr;
    private int i;
    public Stack(){

        arr=new int[5];
    }
    public Stack(int n){

        arr=new int[n];
    }

    public void push(int item) throws Exception{
        if(isFull())
        {
            throw new Exception("Extra element");
        }
        arr[i]=item;
        i++;
    }
    public int pop() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Empty stack");
        }
        i--;
        return arr[i];
    }

    public int peek(){

        return arr[i-1];
    }
    public void display(){
        for(int j=0;j<i;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public boolean isEmpty()
    {
        return i==0;
    }
    public int size()
    {

        return i;
    }
    public boolean isFull()
    {
        return i==arr.length;

    }

}
