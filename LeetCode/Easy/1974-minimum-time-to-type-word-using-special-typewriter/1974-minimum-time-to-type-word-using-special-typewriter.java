class Solution 
{
    public int minTimeToType(String word) 
    {
        int secs=0;
        char in='a';
        for(int i=0;i<word.length();i++)
        {
            char w=word.charAt(i);
            int diff=Math.abs((int)w-(int)in);
            int t=Math.min(diff,26-diff);
            secs+=t+1;
            in=w;
        }
        return secs;
    }
}