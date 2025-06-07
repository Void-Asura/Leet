class Solution 
{
    public int[][] transpose(int[][] matrix) 
    {
        int m=matrix[0].length;
        int n=matrix.length;
        int tra[][]=new int[m][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                tra[j][i]=matrix[i][j];
            }
        }
        return tra;
    }
}