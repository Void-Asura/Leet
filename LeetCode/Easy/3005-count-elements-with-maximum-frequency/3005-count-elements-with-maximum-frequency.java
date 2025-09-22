import java.util.*;
class Solution 
{
    public int maxFrequencyElements(int[] nums) 
    {
        int max=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
            max=Math.max(max,hm.get(num));
        }
        int freq=0;
        for(int i:hm.values())
        {
            if(i==max)
            freq+=i;
        }
        return freq;
    }
}