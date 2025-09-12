class Solution 
{
    public int oddCells(int m, int n, int[][] indices) 
    {
        int[] r = new int[m];
        int[] c = new int[n];

        for (int[] index : indices) 
        {
            r[index[0]]++;
            c[index[1]]++;
        }

        int count = 0;
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if ((r[i] + c[j]) % 2 == 1) 
                {
                    count++;
                }
            }
        }

        return count;
    }
}