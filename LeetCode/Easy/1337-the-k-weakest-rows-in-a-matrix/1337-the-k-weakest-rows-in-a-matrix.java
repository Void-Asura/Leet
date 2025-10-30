class Solution 
{
    public int[] kWeakestRows(int[][] mat, int k) 
    {
        int m = mat.length;
        int n = mat[0].length;
        int[] soldiers = new int[m];

        
        
        for (int i = 0; i < m; i++) 
        {
            int count = 0;
            for (int j = 0; j < n; j++) 
            {
                if (mat[i][j] == 1)
                    count++;
                else
                    break; 
            }
            soldiers[i] = count;
        }
        
        
        int[] index = new int[m];
        for (int i = 0; i < m; i++) index[i] = i;

        for (int i = 0; i < m - 1; i++) 
        {
            for (int j = i + 1; j < m; j++) 
            {
                if (soldiers[i] > soldiers[j] || (soldiers[i] == soldiers[j] && index[i] > index[j])) 
                   {
                    int temp = soldiers[i];
                    soldiers[i] = soldiers[j];
                    soldiers[j] = temp;

                    
                    int tempIndex = index[i];
                    index[i] = index[j];
                    index[j] = tempIndex;
                }
            }
        }

        
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = index[i];
        }

        return ans;
    }
}