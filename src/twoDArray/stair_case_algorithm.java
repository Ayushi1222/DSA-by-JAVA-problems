package twoDArray;

public class stair_case_algorithm {
    public static void main(String[] args) {
        int[][] a= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int item=5;
        boolean result=search(a,item);
        System.out.print(result);
    }
    public static boolean search(int[][] a,int item){
        int r=a.length-1; // no. of rows in matrix
        int c=0;
        while(r>=0 && c<a[0].length) // no. of columns
        {
            if(a[r][c]==item)
            {
                return true;
            }
            else if(a[r][c]>item)
            {
                r--;
            }
            else {
                c++;
            }
        }
        return false;
    }
}
