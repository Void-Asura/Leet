class Solution 
{
    public int getLucky(String s, int k) 
    {
        String sum="";
        for(char c:s.toCharArray())
        {
            int temp=c-'a'+1;
            sum+=temp;
        }
        
        while(k-- >0)
        {
            int temp=0;
            for(char c:sum.toCharArray())
            {
                temp+=c-'0';
            }
            sum=String.valueOf(temp);
        }

        return Integer.parseInt(sum);
    }
}