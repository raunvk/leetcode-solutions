class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        for (int num : nums) {
            currentList.add(num);
        }
        while (!currentList.isEmpty()) {
            Set<Integer> set = new HashSet<>();
            List<Integer> newList = new ArrayList<>();
            Iterator<Integer> iterator = currentList.iterator();
            while (iterator.hasNext()) {
                Integer n = iterator.next();
                if (set.add(n)) {
                    newList.add(n);
                    iterator.remove();  
                }
            }
            result.add(newList);
        }
        return result;
    }
}
