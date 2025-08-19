class Solution 
{
    public long zeroFilledSubarray(int[] nums) 
    {
        long count = 0, streak = 0;

        for (int num : nums) {
            if (num == 0) {
                streak++;
            } else {
                count += (streak * (streak + 1)) / 2;
                streak = 0;
            }
        }

        count += (streak * (streak + 1)) / 2;

        return count;
    }
}