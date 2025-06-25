class Solution 
{
    public boolean checkIfPangram(String sentence) 
    {
        // Set<Character> s=new HashSet<>();
        // for(int i=0;i<sentence.length();i++)
        // {
        //     s.add(sentence.charAt(i));
        // }
        // return s.size()==26?true:false;

        for(char i='a';i<='z';i++)
        {
            if(sentence.indexOf(i)<0)
            return false;
        }
        return true;
    }
}