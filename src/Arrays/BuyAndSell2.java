package Arrays;

public class BuyAndSell2 {
    public static void main(String[] args) {
        int[] a={7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }
    public static int maxProfit(int[] a) {
        int min=a[0];
        int profit=0;
        int cost=0;
        int i=1;
        while(i<a.length)
        {
            if(a[i]>min)
            {
                cost=a[i]-min;
                profit+=cost;
                min=a[i];
            }
            else if(a[i]<min)
            {
                min=a[i];

            }
            i++;
        }
        return profit;
        }

}
