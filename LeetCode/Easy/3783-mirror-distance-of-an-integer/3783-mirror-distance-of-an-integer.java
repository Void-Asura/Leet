class Solution 
{
    public int mirrorDistance(int n) 
    {
        StringBuilder sbr=new StringBuilder(String.valueOf(n));
        long rev=Long.parseLong(sbr.reverse().toString());
        return (int)Math.abs((long)n-rev);
    }
}