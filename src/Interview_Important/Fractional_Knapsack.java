package Interview_Important;
import java.util.*;
 class Item {
     int value, weight;
     Item(int x, int y){
         this.value = x;
         this.weight = y;
     }
 }
class itemComparator implements Comparator<Item>
{
    public int compare(Item a, Item b)
    {
        double r1 = (double)(a.value) / (double)(a.weight);
        double r2 = (double)(b.value) / (double)(b.weight);
        if(r1 < r2) return 1;
        else if(r1 > r2) return -1;
        else return 0;
    }
}
public class Fractional_Knapsack {
    public static void main(String[] args) {
        Item[] arr = { new Item(60, 10), new Item(100, 20), new Item(120, 30) };
        int w = 50;
        Arrays.sort(arr, new itemComparator());
        int currWeight=0;
        double finalvalue=0.0;
        for(int i=0;i<arr.length;i++)
        {
            if(currWeight+arr[i].weight<=w)
            {
                finalvalue+=(double)arr[i].value;
                currWeight+=(double)arr[i].weight;
            }
            else
            {
                finalvalue+=((double)arr[i].value/(double)arr[i].weight) * (double)(w-currWeight);
                break;
            }
        }
        System.out.println(finalvalue);
    }
}
