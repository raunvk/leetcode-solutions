class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1)
            return s;
        String result = "";
        String palindrome = "";
        int left_index, right_index;
        for(int i=1; i<s.length(); i++) {
            //for odd length
            left_index = i;
            right_index = i;
            palindrome = returnPalindrome(s, left_index, right_index);
            if(palindrome.length() > result.length())
                result = palindrome;
            //for even length
            left_index = i-1;
            right_index = i;
            palindrome = returnPalindrome(s, left_index, right_index);
            if(palindrome.length() > result.length())
                result = palindrome;          
        }
        return result;
    }
    public String returnPalindrome(String s, int left_index, int right_index) {
        while(s.charAt(left_index) == s.charAt(right_index)) {
            left_index--;
            right_index++;
            if(left_index<0 || right_index==s.length())
                break;
        }
        return s.substring(left_index+1, right_index);
    }
}