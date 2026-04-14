class Solution 
{
    public String concatHex36(int n) 
    {
        int square = n * n;
        int cube = n * n * n;

        String hex = toBase(square, 16);
        String base36 = toBase(cube, 36);

        return hex + base36;
    }
    private String toBase(int num, int base) 
    {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();

        while (num > 0) 
        {
            int rem = num % base;
            sb.append(chars.charAt(rem));
            num /= base;
        }

        return sb.reverse().toString();
    }
}