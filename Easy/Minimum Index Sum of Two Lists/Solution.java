class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Set<String> set1 = new HashSet<>(Arrays.asList(list1));
        Set<String> set2 = new HashSet<>(Arrays.asList(list2));
        Map<String, Integer> tMap = new TreeMap<>();
        for(String word : set1) {
            if(set2.contains(word)) {
                int indexSum = Arrays.asList(list1).indexOf(word) + Arrays.asList(list2).indexOf(word);
                tMap.put(word, indexSum);
            }
        }
        int minIndexSum = Collections.min(tMap.values());
        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> e : tMap.entrySet()) {
            if (e.getValue() == minIndexSum) {
                result.add(e.getKey());
            }
        }
        return result.toArray(new String[0]);
    }
}