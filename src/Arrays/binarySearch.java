package Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] a={2,3,4,5,6,7,8,9,10,11,12,13,14};
        int val=14;
        binarySearch(a,val);

    }
    public static int binarySearch(int[] a, int val)
    {
        int start=0;
        int end=a.length-1;
        while(start<=end)
        {
            int med=(start+end)/2;
            if(a[med]==val)
                return med;
            else if(a[med]>val)
                end=med-1;
            else
                start=med+1;
        }
        return -1;
    }
}
