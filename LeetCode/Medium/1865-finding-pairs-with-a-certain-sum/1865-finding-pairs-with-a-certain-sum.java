import java.util.Hashtable;
class FindSumPairs 
{
    int []nums1;
    int []nums2;
    Hashtable<Integer,Integer> ht;

    public FindSumPairs(int[] nums1, int[] nums2) 
    {
       this.nums1=nums1;
       this.nums2=nums2;
       this.ht=new Hashtable<>();
       for(int i:nums2)
       {
        ht.put(i,ht.getOrDefault(i,0)+1);
       }
    }
    
    public void add(int index, int val) 
    {
        int old=nums2[index];
        ht.put(old,ht.get(old)-1);
        nums2[index]+=val;
        ht.put(nums2[index],ht.getOrDefault(nums2[index],0)+1);
    }
    
    public int count(int tot) 
    {
        int count=0;
        for(int i=0;i<nums1.length;i++)
        {
            int temp=tot-nums1[i];
            count+=ht.getOrDefault(temp,0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */