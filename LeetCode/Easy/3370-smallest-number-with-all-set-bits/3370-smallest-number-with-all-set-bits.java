class Solution 
{
    public int smallestNumber(int n) 
    {
        int bin=0;
        while(n>0)
        {
            bin++;
            n/=2;
        }
        int num=0;
        for(int i=0;i<bin;i++)
        {
            num+=Math.pow(2,i);
        }
        return num;
    }
}