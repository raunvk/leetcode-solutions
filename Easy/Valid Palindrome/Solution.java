class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(!Character.isLetterOrDigit(c1) && Character.isLetterOrDigit(c2)) {
                i++;
            }
            else if(Character.isLetterOrDigit(c1) && !Character.isLetterOrDigit(c2)) { 
                j--;
            }
            else {
                if(Character.isLetterOrDigit(c1) && Character.isLetterOrDigit(c2)) {
                    if(!(Character.toLowerCase(c1) == Character.toLowerCase(c2)))
                        return false;
                }
                i++; j--;
            }
        }
        return true;
    }
}