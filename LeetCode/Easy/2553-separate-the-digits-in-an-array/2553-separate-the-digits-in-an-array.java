class Solution 
{
    public int[] separateDigits(int[] nums) 
    {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            if(n>9)
            {
                String str=String.valueOf(nums[i]);
                for(char c:str.toCharArray())
                    ls.add(c-'0');
            }
            else
                ls.add(n);
        }
        //return Integer.parseInt(ls.toArray());
        int arr[]=new int[ls.size()];
        for(int i=0;i<ls.size();i++)
        {
            arr[i]=ls.get(i);
        }
        return arr;
    }
}