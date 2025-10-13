class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length(), i = 0;
        StringBuilder result = new StringBuilder();
        while(i<word1.length() && i<word2.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i++));
        }
        if(word1.length()>i) {
            result.append(word1.substring(i--, word1.length()));
        }
        else if(word2.length()>i) {
            result.append(word2.substring(i--, word2.length()));
        }
        return result.toString();
    }
}