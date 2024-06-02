class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        n = (n%2 == 0) ? (--n) : ((--n)-1);
        int mid = (int) n/2;
        for(int i=0; i<=mid; i++) {
            char c = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = c;
        }   
    }
}