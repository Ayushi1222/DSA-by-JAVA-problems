package CodeForces;

import java.util.Scanner;

public class BishopFind {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();  // Consume the newline left-over
        while(n-->0)
        {
            char[][] arr=new char[8][8];
            for(int i=0;i<8;i++) {
                String input = s.next();
                for (int j = 0; j < 8; j++) {
                    arr[i][j] = input.charAt(j);
                }
            }
            for(int i=1;i<7;i++)
            {
                for(int j=1;j<7;j++) {
                    if (arr[i][j] == '#' && arr[i - 1][j - 1] == '#' && arr[i + 1][j + 1] == '#' && arr[i - 1][j + 1] == '#' && arr[i + 1][j - 1] == '#') {
                        System.out.println(i+1 + " " + (j+1));
                        break;
                    }
                }
            }
        }
    }
}
