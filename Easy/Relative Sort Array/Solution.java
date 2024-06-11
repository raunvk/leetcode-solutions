class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map1 = new TreeMap<>();
        Map<Integer, Integer> map2 = new LinkedHashMap<>();
        for(int i : arr1) {
            map1.put(i, map1.getOrDefault(i, 0)+1);
        }
        for(int i : arr2) {
            map2.put(i, map1.get(i));
            map1.put(i, 0);
        }
        int[] result = new int[arr1.length];
        int index = 0;
        for(Map.Entry<Integer, Integer> e : map2.entrySet()) {
            int iteration = e.getValue();
            for(int i=0; i<iteration; i++) {
                result[index] = e.getKey();
                index++;
            }
        }
        for(Map.Entry<Integer, Integer> e : map1.entrySet()) {
            int iteration = e.getValue();
            for(int i=0; i<iteration; i++) {
                result[index] = e.getKey();
                index++;
            }
        }
        return result;
    }
}