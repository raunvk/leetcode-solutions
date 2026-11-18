class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            arr[index]++;
            c = t.charAt(i);
            index = c - 'a';
            arr[index]--;
        }
        for(int n : arr) {
            if(n != 0)
                return false;
        }
        return true;     
    }
}