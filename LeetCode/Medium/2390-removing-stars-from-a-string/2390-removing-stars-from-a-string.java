class Solution 
{
    public String removeStars(String s) 
    {
        StringBuffer sbr=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                if(sbr.length()>0)
                    sbr.delete(sbr.length()-1,sbr.length());
            }
            else
            sbr.append(s.charAt(i));
        }
        return sbr.toString();
        // Stack<Character> st=new Stack<>();
        // for(int i=0;i<s.length();i++)
        // {
        //     if(s.charAt(i)=='*')
        //     {
        //         if(!st.isEmpty())
        //         st.pop();
        //     }
        //     else
        //     st.push(s.charAt(i));
        // }
        // StringBuffer sbr=new StringBuffer();
        // while(!st.isEmpty())
        // {
        //     sbr.append(st.pop());
        // }
        // return sbr.reverse().toString();

    }
}