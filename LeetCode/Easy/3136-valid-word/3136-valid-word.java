class Solution 
{
    public boolean isValid(String word) 
    {
        if (word.length() < 3) 
            return false;

        int v = 0, c = 0;
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) 
        {
            char ch = word.charAt(i);

            if (Character.isDigit(ch)) 
            {
                continue;
            } 
            else if (Character.isLetter(ch)) 
            {
                if ("aeiou".indexOf(ch) >= 0) 
                {
                    v++;
                } 
                else 
                {
                    c++;
                }
            } 
            else 
            {
                return false;
            }
        }

        return v > 0 && c > 0;
    }
}
