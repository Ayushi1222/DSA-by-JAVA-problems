package Arrays;

import java.util.*;

public class unionOfTwoArrays {
    public static void main(String[] args) {
        int[] a = {3, 3, 4, 5, 6, 7, 8, 9, 9, 9 };
        int[] b = {2 ,4 ,10 ,10 };
        List<Integer> ls = new ArrayList<>();
        int i=0;
        int j=0;
        while (i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                ls.add(a[i]);
                i++;
            }
            else if(a[i]>b[j])
            {
                ls.add(b[j]);
                j++;
            }
            else
            {
                i++;
                j++;
            }
        }
        while(i<a.length)
        {
            ls.add(a[i]);
            i++;
        }
        while(j<b.length)
        {
            ls.add(b[j]);
            j++;
        }
        for(int x=0;x<ls.size();x++)
        {
            System.out.print(ls.get(x)+" ");
        }
    }
}
