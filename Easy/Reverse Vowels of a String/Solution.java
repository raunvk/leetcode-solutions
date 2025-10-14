class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        // Using two-pointers
        int start = 0, end = s.length()-1;
        while(start < end) {
            while(start<end && !isVowel(arr[start]))
                start++;
            while(start<end && !isVowel(arr[end]))
                end--;
            if(start < end) {
                swap(arr, start++, end--);
            }
        }
        return new String(arr);
    }
    private boolean isVowel(char c) {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return true;
        return false;
    }
    private void swap(char[] arr, int start, int end) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}