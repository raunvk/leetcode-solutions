class Solution {
    final int mod = 1000000007;
    public int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
    public int countNicePairs(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        /* nums[i] - reverse(nums[i]) == nums[j] - reverse(nums[j]) */
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] - reverse(nums[i]);
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = (int) ((result + map.getOrDefault(nums[i], 0)) % mod);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return result;
    }
}