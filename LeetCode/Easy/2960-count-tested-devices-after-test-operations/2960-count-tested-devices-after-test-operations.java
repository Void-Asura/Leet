class Solution 
{
    public int countTestedDevices(int[] batteryPercentages) 
    {
        int d=0,l=batteryPercentages.length;
        for(int i=0;i<l;i++)
        {
            if(batteryPercentages[i]-d>0)
            {
                d++;
            }
        }
        return d;
    }
}