class Solution 
{
    public String firstPalindrome(String[] words) 
    {
        for(int i=0;i<words.length;i++)
        {
            String str=words[i];
            StringBuilder sbr=new StringBuilder(str);
            if(sbr.reverse().toString().equals(str))
            return str;
        }
        return "";
    }
}