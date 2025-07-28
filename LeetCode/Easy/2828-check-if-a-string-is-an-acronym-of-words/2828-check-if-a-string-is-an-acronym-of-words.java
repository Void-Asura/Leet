class Solution 
{
    public boolean isAcronym(List<String> words, String s) 
    {
        if(s.length()<words.size())
        return false;

        StringBuilder str=new StringBuilder();
        for(String i:words)
        {
            str.append(i.charAt(0));
        }
        return str.toString().equals(s);
    }
}