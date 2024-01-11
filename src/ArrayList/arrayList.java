package ArrayList;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l= new ArrayList<>(); // by default size of arraylist is 10.
        System.out.println(l);
        System.out.println(l.size());
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(50);
        l.add(3,40);
        System.out.println(l);
        System.out.println(l.get(2));
        System.out.println(l.remove(1));
        System.out.println(l.set(2,60));
        System.out.println(l);

        //Autoboxing....
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }

        System.out.println();

        //Unboxing....
        for (int x:l)
        {
            System.out.print(x+" ");
        }

        //size-- already present
        // capacity -- its potential to hold

        // GROW RATE--> (in java) {new capacity= old capacity + old capacity/2}, hence grow rate is 1.5

    }
}
