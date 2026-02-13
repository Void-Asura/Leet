class Solution 
{
    public int countBalls(int lowLimit, int highLimit) 
    {
        int[] boxes = new int[46]; 
        int max = 0;

        for (int num = lowLimit; num <= highLimit; num++)
        {
            int sum = 0;
            int temp = num;

            while (temp > 0)
            {
                sum += temp % 10;
                temp /= 10;
            }

            boxes[sum]++;
            max = Math.max(max, boxes[sum]);
        }

        return max;
    }
}