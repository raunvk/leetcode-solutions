class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length()];
        return dfs(s, 0, wordDict, dp);
    }
    private boolean dfs(String s, int i, List<String> wordDict, int[] dp) {
        if (i == s.length())
            return true;
        if (dp[i] != 0)
            return dp[i] == 1;
        boolean found = false;
        for (String word : wordDict) {
            if (s.startsWith(word, i) && dfs(s, i + word.length(), wordDict, dp)) {
                found = true;
                break;
            }
        }
        dp[i] = found ? 1 : -1;
        return dp[i] == 1;
    }
}