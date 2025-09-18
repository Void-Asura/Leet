import java.util.*;
class Solution 
{
    public int dominantIndex(int[] nums) 
    {
        Hashtable<Integer,Integer> ht=new Hashtable<>();
        for(int i=0;i<nums.length;i++)
        {
            ht.put(nums[i],i);
        }
        Arrays.sort(nums);
        if(nums[nums.length-1]>= 2*nums[nums.length-2])
        return ht.get(nums[nums.length-1]);
        else 
        return -1;
    }
}