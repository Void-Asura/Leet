class Solution 
{
    public int absDifference(int[] nums, int k) 
    {
        Arrays.sort(nums);

        int n = nums.length;
        int smallSum = 0;
        int largeSum = 0;

        for (int i = 0; i < k; i++)
        {
            smallSum += nums[i];
        }

        for (int i = n - k; i < n; i++)
        {
            largeSum += nums[i];
        }

        return Math.abs(largeSum - smallSum);
    }
}