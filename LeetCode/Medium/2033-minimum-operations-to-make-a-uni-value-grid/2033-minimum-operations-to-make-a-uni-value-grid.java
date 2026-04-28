class Solution 
{
    public int minOperations(int[][] grid, int x) 
    {
        List<Integer> list = new ArrayList<>();

        // flatten
        for (int[] row : grid) 
        {
            for (int val : row) 
            {
                list.add(val);
            }
        }

        // check possibility
        int rem = list.get(0) % x;
        for (int num : list) 
        {
            if (num % x != rem) return -1;
        }

        // sort
        Collections.sort(list);

        // median
        int median = list.get(list.size() / 2);

        // calculate operations
        int ops = 0;
        for (int num : list) 
        {
            ops += Math.abs(num - median) / x;
        }

        return ops;
    }
}