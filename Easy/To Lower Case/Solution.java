class Solution {
    public String toLowerCase(String s) {
        char[] result = s.toCharArray();
        for(int i=0; i<s.length(); i++) {
            int n = result[i];
            if(n>=65 && n<=90)
                result[i] = (char) (n + 32);
        }
        return new String(result);
    }
}