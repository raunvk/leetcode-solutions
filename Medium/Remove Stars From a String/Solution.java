class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c=='*' && !stk.isEmpty()) {
                stk.pop();
            }
            else {
                stk.push(c);
            }
        }
        String result = stk.stream().map(ch -> ch.toString()).collect(Collectors.joining(""));
        return result;
    }
}