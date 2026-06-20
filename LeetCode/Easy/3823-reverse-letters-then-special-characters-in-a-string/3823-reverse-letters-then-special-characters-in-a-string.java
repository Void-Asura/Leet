class Solution 
{
    public String reverseByType(String s) 
    {
        StringBuilder letters = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for(char ch : s.toCharArray()) 
        {

            if(Character.isLowerCase(ch))
                letters.append(ch);
            else
                special.append(ch);
        }

        letters.reverse();
        special.reverse();

        StringBuilder ans = new StringBuilder();

        int l = 0;
        int sp = 0;

        for(char ch : s.toCharArray()) 
        {

            if(Character.isLowerCase(ch))
                ans.append(letters.charAt(l++));
            else
                ans.append(special.charAt(sp++));
        }

        return ans.toString();
    }
}