class Solution 
{
    public int maximumUniqueSubarray(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();
        int l = 0, r = 0;
        int tempSum = 0, maxSum = 0;

        while (r < nums.length) 
        {
            if (!set.contains(nums[r])) 
            {
                tempSum += nums[r];
                set.add(nums[r]);
                maxSum = Math.max(maxSum, tempSum);
                r++;
            } 
            else 
            {
                tempSum -= nums[l];
                set.remove(nums[l]);
                l++;
            }
        }

        return maxSum;
    }
}