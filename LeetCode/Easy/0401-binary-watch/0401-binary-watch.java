class Solution 
{
    public List<String> readBinaryWatch(int turnedOn) 
    {
         List<String> res = new ArrayList<>();

        for (int hour = 0; hour < 12; hour++)
        {
            for (int minute = 0; minute < 60; minute++)
            {
                if (Integer.bitCount(hour) + 
                    Integer.bitCount(minute) == turnedOn)
                {
                    res.add(hour + ":" + 
                           (minute < 10 ? "0" + minute : minute));
                }
            }
        }

        return res;
    }
}