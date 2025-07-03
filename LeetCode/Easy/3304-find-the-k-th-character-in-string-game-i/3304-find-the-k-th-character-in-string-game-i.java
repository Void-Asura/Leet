class Solution 
{
    public char kthCharacter(int k) 
    {
        StringBuilder sbr=new StringBuilder("a");
        while(sbr.length()<k)
        {
            StringBuilder temp=new StringBuilder();
            for(int i=0;i<sbr.length();i++)
            {
                char ch = sbr.charAt(i);
                if (ch == 'z') 
                    temp.append('a');
                else 
                    temp.append((char)(ch + 1));
            }
            sbr.append(temp);
        }
        return sbr.charAt(k-1);
    }
}