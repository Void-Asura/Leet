class Solution 
{
    public int minOperations(int[] nums) 
    {
        int n=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                int temp=nums[i-1]-nums[i]+1;
                n+=temp;
                nums[i]+=temp;
            }
        }
        return n;
    }
}