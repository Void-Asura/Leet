class Solution 
{
    public int smallestIndex(int[] nums) 
    {
        for (int i = 0; i < nums.length; i++) 
        {
            if (digitSum(nums[i]) == i) return i;
        }
        return -1;
    }

    private int digitSum(int x) 
    {
        int s = 0;
        while (x > 0) 
        {
            s += x % 10;
            x /= 10;
        }
        return s;
    }
}