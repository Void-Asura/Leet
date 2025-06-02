class Solution 
{
    public int largestAltitude(int[] gain) 
    {
        int alt=0,temp=0+gain[0];
        alt=Math.max(alt,temp);
        for(int i=1;i<gain.length;i++)

        {
            temp+=gain[i];
            if(temp>alt)
            alt=temp;
        }
        return alt;
    }
}