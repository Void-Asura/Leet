class Solution 
{
    public int[][] flipAndInvertImage(int[][] image) 
    {
        int n=image.length;
        int nm[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            int k=0;
            for(int j=n-1;j>=0;j--)
            {
                nm[i][k]=image[i][j]==1?0:1;
                k++;
            }
        }
        return nm;
    }
}