class Solution 
{
    public int countDistinctIntegers(int[] nums) 
    {
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            st.add(nums[i]);
            StringBuilder sbr=new StringBuilder(String.valueOf(nums[i]));
            st.add(Integer.parseInt(sbr.reverse().toString()));
        }
        return st.size();
    }
}