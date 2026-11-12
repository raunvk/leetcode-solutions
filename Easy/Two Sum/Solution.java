class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> temp = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int comp = target-nums[i];
            if(temp.containsKey(comp)) {
                result[0] = temp.get(comp);
                result[1] = i;
                return result;
            }
            temp.put(nums[i], i);
        }
        return new int[2];
    }
}