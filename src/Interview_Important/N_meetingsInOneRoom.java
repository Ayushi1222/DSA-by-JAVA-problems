package Interview_Important;

import java.util.*;

public class N_meetingsInOneRoom {
//    https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
    public static void main(String[] args) {
        int[] s={};
        int[] e={};
        int n=s.length;
        System.out.println(maxMeetings(s,e,n));

    }
    public static int maxMeetings(int s[], int e[], int n)
    {
        int[][] meetings = new int[n][2];
        for (int i=0;i<n;i++)
        {
            meetings[i][0] = s[i];
            meetings[i][1] = e[i];
        }
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[1], b[1]));
        int preend=-1;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if (meetings[i][0] > preend) {
                c++;
                preend = meetings[i][1];
            }
        }
        return c;
    }
}
