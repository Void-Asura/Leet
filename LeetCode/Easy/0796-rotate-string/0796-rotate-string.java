class Solution 
{
    public boolean rotateString(String s, String goal) 
    {        
        // int n=1;
        // while(n<=s.length())
        // {
        //     char ch=s.charAt(0);
        //     s=s.substring(1,s.length())+ch;
        //     if(s.equals(goal))
        //     return true;
        //     n++;
        // }
        // return false;

        if((s+s).contains(goal) && s.length()==goal.length())
        return true;
        return false;
    }
}