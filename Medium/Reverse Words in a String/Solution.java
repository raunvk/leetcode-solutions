class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c!=' ')
                temp.append(c);
            else if(!temp.isEmpty()) {
                result.insert(0, " ").insert(0, temp);
                temp.setLength(0);
            }
        }
        result.insert(0, " ").insert(0, temp);
        return result.toString().trim();
    }
}