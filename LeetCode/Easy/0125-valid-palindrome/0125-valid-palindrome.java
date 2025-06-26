class Solution 
{
    public boolean isPalindrome(String s) 
    {
        s=s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if("qwertyuiopasdfghjklzxcvbnm1234567890".indexOf(s.charAt(i))>=0)
            str+=s.charAt(i);
        }
        StringBuffer sbr=new StringBuffer(str);
        return str.equals(sbr.reverse().toString());
    }
}