package Backtracking;

import java.util.Scanner;

public class RatChases {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        char[][] a = new char[m][n];
        for (int i = 0; i < m; i++) {
            String st = s.next();
            for (int j = 0; j < st.length(); j++) {
                a[i][j] = st.charAt(j);
            }
        }
        path(a, m, n);
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 'X')
                    ans[i][j] = 0;
                else
                    ans[i][j] = 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void path(char[][] a, int r, int c) {
        if (r == a.length - 1 && c == a[0].length) {
            display(a);
            return;
        }
        if (r < 0 || r > a.length || c < 0 || c > a[0].length || a[r][c] == 'X') {
            return;
        }
        a[r][c] = 'X';
        path(a, r - 1, c);//up
        path(a, r, c + 1);//right
        path(a, r + 1, c);//down
        path(a, r, c - 1);//left
        a[r][c] = 'O';
    }

    public static void display(char[][] a)
    {
        int m=a.length;
        int n=a[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 'X')
                    ans[i][j] = 0;
                else
                    ans[i][j] = 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}