class Solution {
    public int myAtoi(String s) {
        int i = 0, sign = 1, n = s.length();
        //Skip leading whitespace
        while (i<n && s.charAt(i)==' ') {
            i++;
        }
        //Check for optional sign
        if (i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')) {
            sign = (s.charAt(i++)=='-')? -1 : 1;
        }
        long num = 0;
        //Convert digits to number
        while (i<n && Character.isDigit(s.charAt(i))) {
            num = num*10 + (s.charAt(i++) - '0');
            //Stop if the number exceeds the bounds of int
            if (num>Integer.MAX_VALUE) {
                break;
            }
        }
        num *= sign;
        //Clamp to integer bounds
        if (num<Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (num>Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)num;
    }
}