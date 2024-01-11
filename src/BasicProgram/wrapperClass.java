package BasicProgram;

public class wrapperClass {
    public static void main(String[] args) {
        Integer a=10; // address of this a is stored in stack
        int b=10;  // value of this b is stored in stack
        System.out.println(a);
        System.out.println(b);

        //Autoboxing-- data goes from stack to heap
        int c=9;
        Integer c2=90;
        c2=c;

        //Unboxing
        int d=4;
        Integer d2=40;
        d=d2;

        //In cache -- size is 256 so it ranges from -128 to 127, if it is out of this range address will be different.
        Integer e1=78;
        Integer e2=78;
        Integer e3=127;
        Integer e4=127;
        System.out.println(e1==e2);
        System.out.println(e3==e4);

    }
}
