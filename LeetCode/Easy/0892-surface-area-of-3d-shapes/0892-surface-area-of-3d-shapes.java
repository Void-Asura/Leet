class Solution 
{
    public int surfaceArea(int[][] grid) 
    {
        int n = grid.length;
        int surface = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                int v = grid[i][j];

                if (v > 0)
                {
                    // top + bottom
                    surface += 2;

                    // 4 side faces
                    surface += 4 * v;

                    // subtract overlap with top neighbor
                    if (i > 0)
                        surface -= 2 * Math.min(v, grid[i - 1][j]);

                    // subtract overlap with left neighbor
                    if (j > 0)
                        surface -= 2 * Math.min(v, grid[i][j - 1]);
                }
            }
        }

        return surface;
    }
}