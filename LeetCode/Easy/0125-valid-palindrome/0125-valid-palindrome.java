class Solution 
{
    public boolean isPalindrome(String s) 
    {
        s=s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            str+=s.charAt(i);
        }
        // StringBuffer sbr=new StringBuffer(str);
        // return str.equals(sbr.reverse().toString());
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        return str.equals(rev);
    }
}