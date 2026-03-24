class Solution 
{
    public int[][] constructProductMatrix(int[][] grid) 
    {
        int n = grid.length;
        int m = grid[0].length;
        int mod = 12345;

        int size = n * m;
        int[] arr = new int[size];

        // flatten grid
        int index = 0;
        for (int[] row : grid) 
        {
            for (int val : row) 
            {
                arr[index++] = val % mod;
            }
        }

        int[] prefix = new int[size];
        int[] suffix = new int[size];

        // prefix
        prefix[0] = 1;
        for (int i = 1; i < size; i++) 
        {
            prefix[i] = (prefix[i - 1] * arr[i - 1]) % mod;
        }

        // suffix
        suffix[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) 
        {
            suffix[i] = (suffix[i + 1] * arr[i + 1]) % mod;
        }

        // build result
        int[][] result = new int[n][m];
        index = 0;

        for (int i = 0; i < size; i++) 
        {
            int val = (prefix[i] * suffix[i]) % mod;
            result[i / m][i % m] = val;
        }

        return result;
    }
}