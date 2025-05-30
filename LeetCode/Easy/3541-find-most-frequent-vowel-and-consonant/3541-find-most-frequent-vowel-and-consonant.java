import java.util.*;
class Solution 
{
    public int maxFreqSum(String s) 
    {
        Map<Character,Integer> mp=new HashMap<>();
        Set<Character> vowels=Set.of('a','e','i','o','u');
        int maxV=0,maxC=0;
        for(int i=0;i<s.length();i++)
        {
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }

        for(char c: mp.keySet())
        {
            if(vowels.contains(c))
            maxV=Math.max(maxV,mp.get(c));
            else
            maxC=Math.max(maxC,mp.get(c));
        }
        return maxV+maxC;
    }
}