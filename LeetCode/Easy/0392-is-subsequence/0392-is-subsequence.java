class Solution 
{
    public boolean isSubsequence(String s, String t) 
    {
        int j=-1;
        for(int i=0;i<s.length();i++)
        {
                int index=t.indexOf(s.charAt(i),j+1);
                if(index>j)
                j=index;
                else
                return false;
        }
        return true;
    }
}