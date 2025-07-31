import java.util.Hashtable;
class Solution 
{
    public int sumOfUnique(int[] nums) 
    {
        Hashtable<Integer,Integer> ht=new Hashtable<>();
        for(int i=0;i<nums.length;i++)
        {
            ht.put(nums[i],ht.getOrDefault(nums[i],0)+1);
        }
        int sum=0;
        for(int key:ht.keySet())
        {
            if(ht.get(key)==1)
            sum+=key;
        }
        return sum;
    }
}