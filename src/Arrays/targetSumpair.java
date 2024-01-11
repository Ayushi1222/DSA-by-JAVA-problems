package Arrays;
import java.util.Arrays;

public class targetSumpair {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int target=5;
        Arrays.sort(a);
        for(int i=a.length-1;i>=0;i--) {
            int n2 = 0;
            int two = target - a[i];
            int start = 0;
            int end = i - 1;
            if (two != 0) {
                while (start <= end)
                {
                    int med = (start + end) / 2;
                    if (a[med] == two) {
                        n2 = a[med];
                        break;
                    } else if (a[med] < two)
                        start = med + 1;
                    else
                        end = med - 1;
                }
                if(n2!=0) {
                    System.out.println(n2 + " and " + a[i]);
                }
            }
        }
    }

}
