class Solution 
{
    public int[] frequencySort(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) 
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] unique = new int[map.size()];
        int idx = 0;
        for (int key : map.keySet()) 
        {
            unique[idx++] = key;
        }

 
        for (int i = 0; i < unique.length - 1; i++) 
        {
            for (int j = i + 1; j < unique.length; j++) 
            {
                int freq1 = map.get(unique[i]);
                int freq2 = map.get(unique[j]);
                if (freq1 > freq2 || (freq1 == freq2 && unique[i] < unique[j])) 
                {
                    int temp = unique[i];
                    unique[i] = unique[j];
                    unique[j] = temp;
                }
            }
        }

      
        int index = 0;
        for (int num : unique) 
        {
            int freq = map.get(num);
            for (int i = 0; i < freq; i++) 
            {
                nums[index++] = num;
            }
        }

        return nums;
    }
}