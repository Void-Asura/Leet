class Solution 
{
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) 
    {
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==key)
            {
                for(int j=0;j<nums.length;j++)
                {
                    if(Math.abs(i-j)<=k)
                    hs.add(j);
                }
            }
        }
        List<Integer> ls=new ArrayList<>(hs);
        Collections.sort(ls);
        return ls;

    }
}