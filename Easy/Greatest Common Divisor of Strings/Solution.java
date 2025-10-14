class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
            return "";
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }
    // Assuming l1 is always greater than l2
    private int gcd(int l1, int l2) {
        if(l2 == 0)
            return l1;
        return gcd(l2, l1%l2);
    }
}