import java.util.Hashtable;
class Solution 
{
    public int maxDifference(String s) 
    {
        Hashtable<Character,Integer> ht=new Hashtable<>();
        for(int i=0;i<s.length();i++)
        {
            ht.put(s.charAt(i),ht.getOrDefault(s.charAt(i),0)+1);
        }
        int mini=Integer.MAX_VALUE,maxa=Integer.MIN_VALUE;
        for(int i:ht.values())
        {
            if(i%2==0)
            {
                mini=Math.min(mini,i);
            }
            else
            {
                maxa=Math.max(maxa,i);
            }
        }
        return maxa-mini;
    }
}