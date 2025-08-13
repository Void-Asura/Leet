class Solution 
{
    public int maximumValue(String[] strs) 
    {
        int maxVal = 0;

        for (String s : strs) {
            boolean isDigitOnly = true;

            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    isDigitOnly = false;
                    break;
                }
            }

            int value;
            if (isDigitOnly) {
                value = Integer.parseInt(s);
            } else {
                value = s.length();
            }

            maxVal = Math.max(maxVal, value);
        }

        return maxVal;
    }
}