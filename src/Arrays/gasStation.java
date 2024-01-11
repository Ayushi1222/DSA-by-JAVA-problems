package Arrays;

public class gasStation {
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        int x=index(gas,cost);
        System.out.print(x);
    }
    //If Total sum is negative then answer can never exist, pehle first ko start index maneege ,agr difference negative hai
    // to uska agla point start index hoga aur agr ek baar positive hogya or end tk positive hi rha to wahi ans hoga
    // firse loop ki zarurat nhi hai becz total negative humne pehle hi check krliya!!!!
    public static int index(int[] gas , int[] cost)
    {
        int sum=0;
        int curr_sum=0;
        int si=0;
        for(int i=0;i<cost.length;i++)
        {
            sum+=(gas[i]-cost[i]);
            curr_sum+=(gas[i]-cost[i]);
            if(curr_sum<0){
                si=i+1;
                curr_sum=0;
            }
        }
        if(sum<0)
            return -1;
        return si;
    }
}
