class Solution {
    public int vowelStrings(String[] words, int left, int right) {

        int result = 0;
        while(left<=right) {
            String s = words[left];
            if(s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o' || s.charAt(0)=='u'){
                if(s.charAt(s.length()-1)=='a' || s.charAt(s.length()-1)=='e' || s.charAt(s.length()-1)=='i' || s.charAt(s.length()-1)=='o' || s.charAt(s.length()-1)=='u'){
                    result++;
                }
            }
            left++;
        }
        return result;
    }
}