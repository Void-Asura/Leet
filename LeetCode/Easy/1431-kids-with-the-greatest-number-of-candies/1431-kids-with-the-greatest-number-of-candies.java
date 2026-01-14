class Solution 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int max = 0;
        for (int c : candies)
        {
            if (c > max) max = c;
        }

        List<Boolean> ans = new ArrayList<>();
        for (int c : candies)
        {
            ans.add(c + extraCandies >= max);
        }

        return ans;
    }
}