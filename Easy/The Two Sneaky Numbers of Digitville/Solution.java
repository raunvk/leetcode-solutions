class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[2];
        int index = 0;
        for(int n : nums) {
            if(set.contains(n))
                result[index++] = n;
            else
                set.add(n);
        }
        return result;
    }
}