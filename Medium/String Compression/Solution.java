class Solution {
    public int compress(char[] chars) {
        int index=0, start=0;
        while(start < chars.length) {
            int end = start;
            while(end<chars.length && chars[start]==chars[end])
                end++;
            chars[index++] = chars[start];
            int count = end-start;
            if(count > 1) {
                char[] freq = Integer.toString(count).toCharArray();
                for(char c : freq) {
                    chars[index++] = c;
                } 
            }
            start = end;
        }
        return index;
    }
}