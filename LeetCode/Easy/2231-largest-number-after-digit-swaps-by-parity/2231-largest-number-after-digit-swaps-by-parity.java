class Solution 
{
    public int largestInteger(int num) 
    {
        char[] arr = String.valueOf(num).toCharArray();

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (char c : arr) 
        {

            int digit = c - '0';

            if (digit % 2 == 0) 
            {
                even.add(digit);
            } 
            else 
            {
                odd.add(digit);
            }
        }

        odd.sort(Collections.reverseOrder());
        even.sort(Collections.reverseOrder());

        int o = 0;
        int e = 0;

        StringBuilder sb = new StringBuilder();

        for (char c : arr) 
        {

            int digit = c - '0';

            if (digit % 2 == 0) 
            {
                sb.append(even.get(e++));
            } 
            else 
            {
                sb.append(odd.get(o++));
            }
        }

        return Integer.parseInt(sb.toString());
    }
}