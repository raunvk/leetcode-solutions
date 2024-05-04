class Solution {
    public int[] palindromeLength(int l, int r, String s){
        int[] ret = new int[3];
        while(l>=0 && r<s.length()) {
            if(s.charAt(l)==s.charAt(r)) {
                l--;
                r++;
            }
            else break;
        }
        ret[0] = r-l-1;
        ret[1] = l+1;
        ret[2] = r-1;
        return ret;
    }
    public String longestPalindrome(String s) {
        int max_len = 0;
        int[] ret = new int[3];
        int start = 0;
        int end = 0;
        //for odd length palindrome
        for(int i=0; i<s.length()-1; i++) {
            ret = palindromeLength(i, i, s);
            int len = ret[0];
            if(len>max_len) {
                max_len = len;
                start = ret[1];
                end = ret[2];
            }
        }
        //for even length palindrome
        for(int i=0; i<s.length()-1; i++) {
            ret = palindromeLength(i, i+1, s);
            int len = ret[0];
            if(len>max_len) {
                max_len = len;
                start = ret[1];
                end = ret[2];
            }
        }
        return s.substring(start, end+1);
    }
}