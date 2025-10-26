class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int n : nums) {
            int complement = k-n;
            //Complement number exists in map? (Is its value > 0?)
            if(map.getOrDefault(complement, 0) > 0) {
                count++;
                //Decrement the value of the complement number
                map.put(complement, map.get(complement)-1);
            }
            //Put the number in map (and increase its current value)
            else
                map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return count;
    }
}