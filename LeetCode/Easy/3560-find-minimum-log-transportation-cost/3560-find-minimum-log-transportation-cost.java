class Solution 
{
    public long minCuttingCost(int n, int m, int k) 
    {
        if (n <= k && m <= k) 
        {
            return 0;
        }

        long cost = Long.MAX_VALUE;

        if (n > k) 
        {
            cost = Math.min(cost, (long) k * (n - k));
        }

        if (m > k) 
        {
            cost = Math.min(cost, (long) k * (m - k));
        }

        return cost;
    }
}