class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int max = 0;
        int maxElement = nums[0];
        int currentElement = nums[0];
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==currentElement) {
                count++;
            }
            else {
                if(count>max) {
                    max = count;
                    maxElement = currentElement;
                }
                currentElement = nums[i];
                count = 1;
            }
        }
        if(count>max) {
            return currentElement;
        }
        return maxElement;
    }
}