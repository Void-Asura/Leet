class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        s=s.trim();
        String []str=s.split(" ");
        String t=str[str.length-1];
        return t.length();
    }
}