class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(i%2 == 0) {
                result[i] = nums[j];
                j++;
            }
            else {
                result[i] = nums[n];
                n++;
            }
        }
        return result;
    }
}