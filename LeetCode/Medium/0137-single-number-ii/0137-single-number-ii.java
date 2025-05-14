import java.util.Hashtable;
class Solution
 {
    public int singleNumber(int[] nums) 
    {
        Hashtable<Integer,Integer> ht=new Hashtable<>();
        for(int i=0;i<nums.length;i++)
        {
            ht.put(nums[i],ht.getOrDefault(nums[i],0)+1);
        } 
        for(int i:ht.keySet())
        {
            if(ht.get(i)==1)
                return i;
        }
        return 1;
    }
}