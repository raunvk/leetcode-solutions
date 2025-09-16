class Solution {
    public int maxFreqSum(String s) {
        Set<Character> v_set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Map<Character, Integer> v_map = new HashMap<>();
        Map<Character, Integer> c_map = new HashMap<>();
        for(char c : s.toCharArray()) {
            if(v_set.contains(c)) {
                v_map.put(Character.valueOf(c), v_map.getOrDefault(c, 0) + 1);
            }
            else {
                c_map.put(Character.valueOf(c), c_map.getOrDefault(c, 0) + 1);
            }
        }
        int max_v = v_map.values().stream().max(Integer::compare).orElse(0);
        int max_c = c_map.values().stream().max(Integer::compare).orElse(0);
        return max_v + max_c;
    }
}