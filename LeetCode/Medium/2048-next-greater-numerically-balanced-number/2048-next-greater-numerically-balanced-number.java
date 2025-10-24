class Solution 
{
    public int nextBeautifulNumber(int n) 
    {
        while(true)
        {
            n++;
            HashMap<Integer,Integer> hm = new HashMap<>();
            int temp = n;
            int len = String.valueOf(temp).length();
            boolean invalid = false;

            while(temp > 0)
            {
                int a = temp % 10;
                temp /= 10;
                if(a > len)
                {
                    invalid = true;
                    break;
                }
                hm.put(a, hm.getOrDefault(a, 0) + 1);
            }

            if(invalid) continue;

            boolean isBeautiful = true;
            for(int key : hm.keySet())
            {
                if(key != hm.get(key))
                {
                    isBeautiful = false;
                    break;
                }
            }

            if(isBeautiful) return n;
        }
    }
}