class Solution 
{
    public int maximumDifference(int[] nums) 
    {
        int minn=nums[0];
        int diff=-1;
        for(int i=1;i<nums.length;i++)
        {
            // for(int j=i+1;j<nums.length;j++)
            // {
            //     if(nums[i]<nums[j])
            //     diff=Math.max(diff,nums[j]-nums[i]);
            // }
            if (nums[i] > minn) {
                diff = Math.max(diff, nums[i] - minn);
            } else {
                minn = nums[i];
            }

        }
        return diff;
    }
}