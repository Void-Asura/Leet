class Solution 
{
    public int[] getNoZeroIntegers(int n) 
    {
        //int []arr=new int[2];

        for(int i=1;i<n;i++)
        {
            int temp=n-i;
            if(haszero(i) && haszero(temp))
            {
                return new int[]{i,temp};
            }
        }
        return new int[]{};
    }
    public static boolean haszero(int x)
    {
        while(x>0)
        {
            if(x%10==0)
            return false;
            x/=10;
        }
        return true;
    }
}