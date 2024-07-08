class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            if(!set.contains(n))
                set.add(n);
            else
                return n;
        }
        return -1;
    }
}