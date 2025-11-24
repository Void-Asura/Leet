class Solution 
{
    public List<Boolean> prefixesDivBy5(int[] nums) 
    {
        List<Boolean> res = new ArrayList<>();
        int prefix = 0;

        for (int b : nums) 
        {
            prefix = (prefix * 2 + b) % 5;
            res.add(prefix == 0);
        }

        return res;
    }
}