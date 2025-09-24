class Solution 
{
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr1) 
        {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        
        List<Integer> list = new ArrayList<>();

        
        for (int num : arr2) 
        {
            while (freqMap.getOrDefault(num, 0) > 0) 
            {
                list.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }

        
        List<Integer> leftovers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) 
        {
            int num = entry.getKey();
            int count = entry.getValue();
            while (count-- > 0) 
            {
                leftovers.add(num);
            }
        }

        
        Collections.sort(leftovers);
        list.addAll(leftovers);

        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) 
        {
            result[i] = list.get(i);
        }

        return result;
    }
}