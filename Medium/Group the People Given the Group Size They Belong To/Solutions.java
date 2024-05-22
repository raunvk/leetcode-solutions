class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<groupSizes.length; i++) {
            int key = groupSizes[i];
            if (map.containsKey(key)) {
                List<Integer> list = map.get(key);
                if (list.size() == key) {
                    result.add(list);
                    list = new ArrayList<>();
                    list.add(i);
                    map.put(key, list);
                } 
                else {
                    list.add(i);
                }
            } 
            else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(key, list);
            }
        }
        for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
            result.add(e.getValue());
        }
        return result;
    }
}