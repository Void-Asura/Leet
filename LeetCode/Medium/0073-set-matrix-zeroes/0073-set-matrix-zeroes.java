class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        List<Integer> rls=new ArrayList<>();
        List<Integer> cls=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    rls.add(i);
                    cls.add(j);
                }
            }
        }
        for(int row:rls)
        {
            for(int col=0;col<matrix[0].length;col++)
            {
                matrix[row][col]=0;
            }
        }
        for(int col:cls)
        {
            for(int row=0;row<matrix.length;row++)
            {
                matrix[row][col]=0;
            }
        }
    }
}