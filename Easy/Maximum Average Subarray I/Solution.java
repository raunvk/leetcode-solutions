class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int prevSum = 0;
        for(int i=0; i<k; i++)
            prevSum += nums[i];
        int maxSum = prevSum;
        for(int i=k; i<nums.length; i++) {
            prevSum = prevSum + nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, prevSum);
        }
        return (double)maxSum/k;
    }
}