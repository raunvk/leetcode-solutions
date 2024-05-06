class Solution {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generateResult(result, "", 0, 0, n);
        return result;
    }
    public void generateResult(List<String> result, String str, int open, int close, int n) {
        if(str.length() == n*2) {
            result.add(str);
            return;
        }
        if(open < n) {
            generateResult(result, str+"(", open+1, close, n);
        }
        if(close < open) {
            generateResult(result, str+")", open, close+1, n);
        }
    }
}