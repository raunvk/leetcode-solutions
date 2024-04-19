class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int sum;
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            sum = 0;
            for(int j=i+1; j<n; j++) {
                sum = nums[i] + nums[j];
                if(sum == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
}
