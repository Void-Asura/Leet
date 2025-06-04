class Solution 
{
    public int countConsistentStrings(String allowed, String[] words) 
    {
        int cons=0;
        for(int j=0;j<words.length;j++)
        {
            String str=words[j];
            int n=0;
            for(int i=0;i<str.length();i++)
            {
                if(allowed.indexOf(str.charAt(i))>=0)
                n++;
            }
            if(n==str.length())
            cons++;
        }
        return cons;
    }
}