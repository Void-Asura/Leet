import java.util.Hashtable;
class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        // int res=0,arr[]=new int[nums.length],k=0;
        // Hashtable<Integer,Integer> ht=new Hashtable<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(ht.getOrDefault(nums[i],0)>0)
        //     {
        //         if(ht.get(nums[i])>2)
        //         res++;
        //         else
        //         {
        //         ht.put(nums[i],ht.getOrDefault(nums[i],0)+1);
        //         arr[k]=nums[i];
        //         k++;
        //         }
        //     }
        //     else
        //     {
        //         ht.put(nums[i],ht.getOrDefault(nums[i],0)+1);
        //         arr[k]=nums[i];
        //         k++;
        //     }
        // }
        // for(int i=0;i<arr.length;i++)
        // {
        //     nums[i]=arr[i];
        // }
        // return res;


        int k = 0; 
        for (int n : nums) 
        {
           
            if (k < 2 || n != nums[k - 2]) 
            {
                nums[k] = n;
                k++;
            }
        }
        return k;
    }
}