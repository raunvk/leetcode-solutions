class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for (int i=0; i<nums.length; i++) {
            nums[i] %= 2;
        }
        int[] count = new int[nums.length + 1];
        count[0] = 1;
        int s = 0, result = 0;
        for (int n : nums) {
            s += n;
            if (s>=k)
                result += count[s-k];
            count[s]++;
        }
        return result;
    }
}