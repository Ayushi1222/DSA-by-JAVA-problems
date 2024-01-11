package ArrayList;

import java.util.*;

public class arraylist_syntax {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        ArrayList<Integer> a=new ArrayList<>();
//
//        for(int i=0;i<10;i++)
//        {
//            a.add(in.nextInt());
//        }
//        System.out.print(a);

        ArrayList<ArrayList<Integer>> b=new ArrayList<>() ;

        for(int i=0;i<3;i++)
        {
            b.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b.get(i).add(in.nextInt());
            }
        }
        System.out.print(b);

    }

}
