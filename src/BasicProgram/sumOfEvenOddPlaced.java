package BasicProgram;

import java.util.Scanner;

public class sumOfEvenOddPlaced {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e_sum = 0, o_sum = 0;
        int i = 1;
        while (n > 0) {
            int r = n % 10;
            if (i % 2 == 0)
            {
                e_sum += r;
            }
            else
            {
                o_sum += r;
            }
            n /= 10;
            i++;
        }
        System.out.println(o_sum);
        System.out.println(e_sum);
    }
}
