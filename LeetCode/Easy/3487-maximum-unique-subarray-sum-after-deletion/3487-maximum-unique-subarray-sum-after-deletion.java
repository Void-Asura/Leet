class Solution 
{
    public int maxSum(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();
        int l = 0, sum = 0, max = Integer.MIN_VALUE;

        for (int r = 0; r < nums.length; r++) {
            // Remove elements from left until nums[r] is unique
            while (set.contains(nums[r])) {
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }

            set.add(nums[r]);
            sum += nums[r];
            max = Math.max(max, sum);
        }

        return max;
    }
}