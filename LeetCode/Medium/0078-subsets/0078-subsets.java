class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> lt=new ArrayList<>();
        lt.add(new ArrayList<>(0));
        
        for (int num : nums) {
            int n = lt.size();
            for (int i = 0; i < n; i++)
            {
                List<Integer> ls = new ArrayList<>(lt.get(i));
                ls.add(num);
                lt.add(ls);
            }
        }
        return lt;
    }
}