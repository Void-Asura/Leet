class Solution {
    public boolean isNumber(String s) {
        char ch = s.charAt(0);

        if (ch == '.') {
            if (s.length() - 1 > 0) {
                if (s.charAt(1) == 'e' || s.charAt(1) == 'E')
                    return false;
                else
                    return dec(s.substring(1, s.length()));
            } else
                return false;
        } else if (ch == '+' || ch == '-') {
            if (s.length() - 1 > 0) {
                char ch1 = s.charAt(1);
                if (ch1 == '.') {
                    if (s.substring(2, s.length()).isEmpty())
                        return false;
                    else {
                        if (s.charAt(2) == 'e' || s.charAt(2) == 'E')
                            return false;
                        else
                            return dec(s.substring(2, s.length()));
                    }
                } else if ("0123456789".indexOf(ch1) >= 0) {
                    return dig(s.substring(1, s.length()));
                } else
                    return false;
            } else
                return false;

        } else if ("0123456789".indexOf(ch) >= 0) {
            return dig(s.substring(1, s.length()));
        } else
            return false;
    }

    public static boolean dec(String s1) {
        if (s1.isEmpty())
            return true;
        for (int i = 0; i < s1.length(); i++) {
            if ("abcdfghijklmnopqrstuvwxyzABCDFGHIJKLMNOPQRSTUVWXYZ+-.".indexOf(s1.charAt(i)) >= 0)
                return false;
            if ("eE".indexOf(s1.charAt(i)) >= 0)
                return exp(s1.substring(i + 1, s1.length()));
        }
        return true;
    }

    public static boolean exp(String s2) {
        if (s2.length() > 0) {
            char ch = s2.charAt(0);
            if (ch == '+' || ch == '-') {
                if (s2.substring(1, s2.length()).isEmpty())
                    return false;
                for (int i = 1; i < s2.length(); i++) {
                    if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ+-.".indexOf(s2.charAt(i)) >= 0)
                        return false;
                }
            } else if ("0123456789".indexOf(ch) >= 0) {
                for (int i = 1; i < s2.length(); i++) {
                    if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ+-.".indexOf(s2.charAt(i)) >= 0)
                        return false;
                }
            } else
                return false;

            return true;
        } else
            return false;
    }

    public static boolean dig(String s3) {
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) == '.')
                return dec(s3.substring(i + 1, s3.length()));
            if (s3.charAt(i) == 'e' || s3.charAt(i) == 'E')
                return exp(s3.substring(i + 1, s3.length()));
            if ("abcdfghijklmnopqrstuvwxyzABCDFGHIJKLMNOPQRSTUVWXYZ+-".indexOf(s3.charAt(i)) >= 0)
                return false;
        }
        return true;
    }
}