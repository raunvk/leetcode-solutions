class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Long> cumulativeSums = new HashMap<>();
        long currentSum = 0;
        long maxSum = Long.MIN_VALUE;
        for (int value : nums) {
            if (cumulativeSums.containsKey(value - k)) {
                long minValue = cumulativeSums.get(value - k);
                maxSum = Math.max(maxSum, currentSum + value - minValue);
            }
            if (cumulativeSums.containsKey(value + k)) {
                long minValue = cumulativeSums.get(value + k);
                maxSum = Math.max(maxSum, currentSum + value - minValue);
            }
            cumulativeSums.put(value, Math.min(cumulativeSums.getOrDefault(value, Long.MAX_VALUE), currentSum));
            currentSum += value;
        }
        return maxSum == Long.MIN_VALUE ? 0 : maxSum;
    }
}