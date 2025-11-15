class Solution 
{
    public int minimumDistance(int[] nums) 
    {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (nums[j] != nums[i]) 
                    continue;

                for (int k = j + 1; k < n; k++)
                {
                    if (nums[k] == nums[i])
                    {
                        int cur = Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                        ans = Math.min(ans, cur);
                    }
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}