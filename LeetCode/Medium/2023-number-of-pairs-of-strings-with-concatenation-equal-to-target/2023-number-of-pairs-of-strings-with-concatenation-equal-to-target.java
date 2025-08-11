class Solution 
{
    public int numOfPairs(String[] nums, String target) 
    {
        int count=0;
        HashMap<String,Integer> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(target.startsWith(nums[i]))
            {
                String suffix = target.substring(nums[i].length());

                if(hm.getOrDefault(suffix, 0) > 0)
                {
                    count += hm.get(suffix);

                    if(nums[i].equals(suffix))
                    {
                        count--;
                    }
                }
            }
        }
        return count;
    }
}