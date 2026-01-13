class Solution 
{
    public String mostCommonWord(String paragraph, String[] banned) 
    {
        HashSet<String> ban = new HashSet<>();
        for (String b : banned)
            ban.add(b.toLowerCase());

        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words = paragraph.split("\\s+");

        HashMap<String, Integer> freq = new HashMap<>();
        String ans = "";
        int max = 0;

        for (String w : words) 
        {
            if (w.length() == 0 || ban.contains(w))
                continue;

            freq.put(w, freq.getOrDefault(w, 0) + 1);

            if (freq.get(w) > max) 
            {
                max = freq.get(w);
                ans = w;
            }
        }

        return ans;
    }
}