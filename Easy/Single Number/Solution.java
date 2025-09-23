class Solution {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for(int i=1; i<nums.length; i++) {
            /*
            XOR Operations -
            1. A^A = 0
            2. A^0 = A
            3. A^B = C
            3. A^B^C = A^C^B
            */
            result = result ^ nums[i];
        }
        return result;
    }
}