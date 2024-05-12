class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int index = 0;
        for(int i=0; i<ans.length; i++) {
            ans[i] = nums[i % nums.length];
        }
        return ans;
    }
}