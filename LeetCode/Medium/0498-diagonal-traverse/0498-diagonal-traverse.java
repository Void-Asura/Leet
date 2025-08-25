class Solution 
{
    public int[] findDiagonalOrder(int[][] mat) 
    {
        int m=mat.length,n=mat[0].length;
        int arr[]=new int[m*n];
        int i=0,j=0,dir=1;
        for(int k=0;k<(m*n);k++)
        {
            arr[k]=mat[i][j];
            i+=(dir==1?-1:1);
            j+=(dir==1?1:-1);

            if(i>=m)
            {
                i=m-1;
                j+=2;
                dir=-dir;
            }
            if(j>=n)
            {
                j=n-1;
                i+=2;
                dir=-dir;
            }
            if(i<0)
            {
                i=0;
                dir=-dir;
            }
            if(j<0)
            {
                j=0;
                dir=-dir;
            }
        }
        return arr;
    }
}