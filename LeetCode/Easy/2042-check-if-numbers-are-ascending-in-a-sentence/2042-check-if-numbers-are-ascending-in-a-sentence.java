class Solution 
{
    public boolean areNumbersAscending(String s) 
    {
        String arr[]=s.split(" ");
        int x=0;
        for(int i=0;i<arr.length;i++)
        {
            if(isNumber(arr[i]))
            {
                if(Integer.parseInt(arr[i])>x)
                x=Integer.parseInt(arr[i]);
                else
                return false;
            }
        }
        return true;
    }
    private static boolean isNumber(String token) 
    {
        for (char c : token.toCharArray()) 
        {
            if (!Character.isDigit(c)) 
            {
                return false;
            }
        }
        return true;
    }

}