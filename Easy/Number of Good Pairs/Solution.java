class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int n : nums) {
            if(map.containsKey(n)) {
                ans += map.get(n);
                map.put(n, map.get(n)+1);
            }
            else {
                map.put(n, 1);
            }
        }
        return ans;
    }
}