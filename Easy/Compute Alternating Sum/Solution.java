class Solution {
    public int alternatingSum(int[] nums) {
        int oddSum = 0, evenSum = 0;
        for(int i=0; i<nums.length; i++) {
            if(i%2 == 0)
                evenSum += nums[i];
            else
                oddSum += nums[i];
        }
        return evenSum - oddSum;
    }
}