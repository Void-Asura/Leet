class Solution 
{
    public String removeStars(String s) 
    {
        // StringBuffer sbr=new StringBuffer(s);
        // for(int i=0;i<sbr.length();i++)
        // {
        //     if(sbr.charAt(i)=='*')
        //     {
        //         sbr.delete(i-1,i+1);
        //     }
        // }
        // return sbr.toString();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                if(!st.isEmpty())
                st.pop();
            }
            else
            st.push(s.charAt(i));
        }
        StringBuffer sbr=new StringBuffer();
        while(!st.isEmpty())
        {
            sbr.append(st.pop());
        }
        return sbr.reverse().toString();

    }
}