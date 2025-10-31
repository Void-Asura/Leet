class Solution 
{
    public int[] getSneakyNumbers(int[] nums) 
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int arr[]=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])>1)
            {
                arr[k]=nums[i];
                k++;
            }
            if(k==2)
            break;
        }
        return arr;
    }
}