class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int lptr = 0;
        int rptr = 0;
        int maxlen = 0;
        HashSet<Character> set = new HashSet<>();
        while(rptr<n) {
            char c = s.charAt(rptr);
            if(!set.contains(c)) {
                set.add(c);
                rptr++;
                maxlen = Math.max(set.size(), maxlen);
            }
            else {
                char x = s.charAt(lptr);
                set.remove(x);
                lptr++;
            }
        }
        return maxlen;
    }
}