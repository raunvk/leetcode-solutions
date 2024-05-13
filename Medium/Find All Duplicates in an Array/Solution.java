class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            if(set.contains(n))
                result.add(n);
            else
                set.add(n);
        }
        return result;
    }
}