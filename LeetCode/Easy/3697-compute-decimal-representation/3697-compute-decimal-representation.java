class Solution 
{
    public int[] decimalRepresentation(int n) 
    {
        List<Integer> list = new ArrayList<>();
        int place = 1;

        while (n > 0) 
        
        {
            int digit = n % 10;

            if (digit != 0) {
                list.add(digit * place);
            }

            n /= 10;
            place *= 10;
        }

        Collections.reverse(list);

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) 
        {
            result[i] = list.get(i);
        }

        return result;
    }
}