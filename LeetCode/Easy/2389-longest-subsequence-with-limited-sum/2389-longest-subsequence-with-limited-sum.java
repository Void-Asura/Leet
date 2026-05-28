class Solution 
{
    public int[] answerQueries(int[] nums, int[] queries) 
    {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) 
        {
            nums[i] += nums[i - 1];
        }

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) 
        {

            int query = queries[i];

            int left = 0;
            int right = nums.length - 1;

            int ans = 0;

            while (left <= right) 
            {

                int mid = left + (right - left) / 2;

                if (nums[mid] <= query) 
                {

                    ans = mid + 1;
                    left = mid + 1;

                } 
                else 
                {

                    right = mid - 1;
                }
            }

            answer[i] = ans;
        }

        return answer;
    }
}