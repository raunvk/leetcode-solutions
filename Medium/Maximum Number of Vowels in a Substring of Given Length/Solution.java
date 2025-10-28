class Solution {
    public int maxVowels(String s, int k) {
        int prevCount = 0;
        for(int i=0; i<k; i++) {
            if(isVowel(s.charAt(i)))
                prevCount++;
        }
        int maxCount = prevCount;
        for(int i=k; i<s.length(); i++) {
            if(isVowel(s.charAt(i-k)))
                prevCount--;
            if(isVowel(s.charAt(i)))
                prevCount++;
            maxCount = Math.max(maxCount, prevCount);
        }
        return maxCount;
    }
    private boolean isVowel(char c) {
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            return true;
        return false;
    }
}