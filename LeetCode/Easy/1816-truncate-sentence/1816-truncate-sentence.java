class Solution 
{
    public String truncateSentence(String s, int k) 
    {
        int w=1;
        s=s.trim();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            w++;
            if(w==(k+1))
            return s.substring(0,i);
        }
        return s;
    }
}