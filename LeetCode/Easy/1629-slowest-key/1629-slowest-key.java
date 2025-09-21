class Solution 
{
    public char slowestKey(int[] releaseTimes, String keysPressed) 
    {
        char ch='a';
        int t=0,prev=0;
        for(int i=0;i<keysPressed.length();i++)
        {
            char temp=keysPressed.charAt(i);
            int curr=releaseTimes[i]-prev;
            if(curr>t)
            {
                t=curr;
                ch=temp;
            }
            else if(curr==t)
            {
                if(temp>ch)
                {
                    t=curr;
                    ch=temp;
                }
            }
            prev=releaseTimes[i];
        }
        return ch;
    }
}