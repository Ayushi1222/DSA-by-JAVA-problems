package BasicProgram;

public class xor {
    public static void main(String[] args) {
        int[] a={3,1,2,4,3};
        int xor1=0;
        int xor2=0;
        for(int i=0;i<a.length;i++)
        {
            xor1=xor1^(i+1);
            xor2=xor2^a[i];
//            System.out.println(xor1);
//            System.out.println(xor2);
        }
        System.out.println(xor1-xor2);
    }
}
