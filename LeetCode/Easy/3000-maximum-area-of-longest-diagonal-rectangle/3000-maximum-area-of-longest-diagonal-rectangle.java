class Solution 
{
    public int areaOfMaxDiagonal(int[][] dimensions) 
    {
        double diagonal=0,maxa=0;
        int m=dimensions.length,n=dimensions[0].length;
        for(int i=0;i<m;i++)
        {
            double temp=Math.sqrt(dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1]);
            double area=dimensions[i][0]*dimensions[i][1];
            if(temp>diagonal)
            {
                diagonal=temp;
                maxa=area;
            }
            else if(temp==diagonal && area >maxa)
            {
                maxa=area;
            }
        }
        return (int)maxa;
    }
}