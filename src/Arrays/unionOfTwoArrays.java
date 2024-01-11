package Arrays;

import java.util.*;

public class unionOfTwoArrays {
    public static void main(String[] args) {
        int[] a = {3, 3, 4, 5, 6, 7, 8, 9, 9, 9 };
        int[] b = {2 ,4 ,10 ,10 };
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < a.length; i++)
            ls.add(a[i]);
        for (int i = 0; i < b.length; i++)
            ls.add(b[i]);
        Collections.sort(ls);
        int k = 1;
        int j = ls.size();
        int num = ls.get(0);
        int c = 1;
        while (k < j) {
            if (num == ls.get(k)) {
                ls.remove(c+1);
                num = ls.get(k+1);
                k--;
                j--;
            }
            else {
                num = ls.get(k);
            }

            k++;
            System.out.println(ls);
        }
    }
}
