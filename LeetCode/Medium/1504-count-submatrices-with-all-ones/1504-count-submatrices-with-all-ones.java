class Solution 
{
    public int numSubmat(int[][] mat) 
    {
        int m = mat.length, n = mat[0].length;
        int[][] height = new int[m][n];
        
        for (int j = 0; j < n; j++) 
        {
            for (int i = 0; i < m; i++) 
            {
                if (mat[i][j] == 1) 
                {
                    height[i][j] = (i > 0 ? height[i-1][j] : 0) + 1;
                }
            }
        }
        
        int ans = 0;
        
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                int minH = height[i][j];
                for (int k = j; k >= 0 && minH > 0; k--) 
                {
                    minH = Math.min(minH, height[i][k]);
                    ans += minH; 
                }
            }
        }
        
        return ans;
    }
}