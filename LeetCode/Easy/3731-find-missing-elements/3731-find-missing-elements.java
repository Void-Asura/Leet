class Solution 
{
    public List<Integer> findMissingElements(int[] nums) 
    {
        List<Integer> missing = new ArrayList<>();
        if (nums == null || nums.length == 0) return missing;

        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) 
        {
            int prev = nums[i - 1];
            int curr = nums[i];

            if (curr == prev) continue;

            for (int x = prev + 1; x < curr; x++) 
            {
                missing.add(x);
            }
        }

        return missing;
    }
}