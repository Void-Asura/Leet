class Solution 
{
    public boolean hasSameDigits(String s) 
    {
        while(s.length()>2)
        {
            String str="";
            for(int i=0;i<s.length()-1;i++)
            {
                int n=(int)s.charAt(i)+(int)s.charAt(i+1)-96;
                str+=String.valueOf(n%10);
            }
            s=str;
        }
        if(s.charAt(0)==s.charAt(1))
        return true;
        else
        return false;
    }
}