class Solution 
{
    public int findMiddleIndex(int[] nums) 
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int ns=0;
        for(int i=0;i<nums.length;i++)
        {
            if(ns==(sum - nums[i] - ns))
            return i;
            
            ns+=nums[i];
        }
        return -1;
    }
}