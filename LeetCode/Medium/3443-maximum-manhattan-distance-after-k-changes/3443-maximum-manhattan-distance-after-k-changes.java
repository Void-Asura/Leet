class Solution 
{
    public int maxDistance(String s, int k) 
    {
        int dis=0,n=0,so=0,e=0,w=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='N')
            n++;
            if(s.charAt(i)=='S')
            so++;
            if(s.charAt(i)=='E')
            e++;
            if(s.charAt(i)=='W')
            w++;

            int x=e-w;
            int y=n-so;
            int md=Math.abs(x)+Math.abs(y);
            int ch=md+Math.min(2*k,(i+1)-md);
            dis=Math.max(dis,ch);
        }
        return dis;
    }
}