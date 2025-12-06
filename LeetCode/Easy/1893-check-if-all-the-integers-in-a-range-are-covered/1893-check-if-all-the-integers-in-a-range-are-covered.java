class Solution 
{
    public boolean isCovered(int[][] ranges, int left, int right) 
    {
        boolean[] covered = new boolean[51]; 

        for (int i = 0; i < ranges.length; i++) 
        {
            int a = ranges[i][0];
            int b = ranges[i][1];
            for (int x = a; x <= b; x++) 
            {
                covered[x] = true;
            }
        }

        for (int x = left; x <= right; x++) 
        {
            if (!covered[x]) 
                return false;
        }

        return true;
    }
}