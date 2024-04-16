package BinarySearch;

public class split_Array_Largest_Sum {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int k=2;
        int start=0;
        int end=0;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            end+=nums[i];
            start=Math.max(start,nums[i]);
        }
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(check(nums, k,mid))
            {
                ans=mid;
                end=mid-1;// kyuki ans minimise krna hai har bar
            }
            else
            {
                start=mid+1;
            }
        }
        System.out.println(ans);
    }
    public static boolean check(int[] nums, int k, int mid)
    {
        int s=1;
        int readpages=0;
        for(int i=0;i<nums.length;i++)
        {
            if(readpages+nums[i]<=mid)
            {
                readpages+=nums[i];
            }
            else
            {
                s++;
                readpages=nums[i];
                if(s>k)
                    return false;
            }

        }
        return s<=k;
    }
}
