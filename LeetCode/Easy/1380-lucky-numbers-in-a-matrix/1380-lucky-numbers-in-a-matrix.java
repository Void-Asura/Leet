class Solution 
{
    public List<Integer> luckyNumbers(int[][] matrix) 
    {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) 
        {
            int minVal = matrix[i][0];
            int colIndex = 0;

            for (int j = 1; j < n; j++) 
            {
                if (matrix[i][j] < minVal) 
                {
                    minVal = matrix[i][j];
                    colIndex = j;
                }
            }

            boolean isLucky = true;
            for (int r = 0; r < m; r++) 
            {
                if (matrix[r][colIndex] > minVal) 
                {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) ans.add(minVal);
        }

        return ans;
    }
}