class Solution 
{
    public int maxAdjacentDistance(int[] nums) 
    {
        int diff=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==nums.length-1)
            diff=Math.max(diff,Math.abs(nums[i]-nums[0]));
            else
            diff=Math.max(diff,Math.abs(nums[i]-nums[i+1]));
        }
        return diff;
    }
}