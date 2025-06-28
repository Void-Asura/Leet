class Solution 
{
    public int[] maxSubsequence(int[] nums, int k) 
    {
        // PriorityQueue<Integer> pq=new PriorityQueue<>();
        // int i=0;
        // for(;i<k;i++)
        // {
        //     pq.add(nums[i]);
        // }

        // while(i<nums.length)
        // {
        //     if(nums[i]>pq.peek())
        //     {
        //         pq.remove();
        //         pq.add(nums[i]);
        //     }
        //     i++;
        // }
        // int arr[]=new int[k];
        // int k1=0;
        // for(int j=0;j<nums.length;j++)
        // {
        //     if(pq.contains(nums[j]))
        //     {
        //         arr[k1]=nums[j];
        //         k1++;
        //         pq.remove(nums[j]);
        //     }
        //    if(k1==k)
        //     break;
        // }
        // return arr;
        if(k==nums.length)
        return nums;

        int arr[]=nums.clone();
        Arrays.sort(arr);
        int res[]=new int[k];
        List<Integer> ls=new ArrayList<>();
        int i=nums.length-1;
        while(k>0)
        {
            ls.add(arr[i]);
            i--;
            k--;
        }
        int temp=0;
        for(int j=0;j<nums.length;j++)
        {
            if(ls.contains(nums[j]))
            {
                res[temp]=nums[j];
                temp++;
                ls.remove((Integer)nums[j]);
            }
        }
        return res;

    }
}