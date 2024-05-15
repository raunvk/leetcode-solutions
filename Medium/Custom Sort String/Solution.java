class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder ans = new StringBuilder();
        for (char c : order.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                ans.append((c+"").repeat(count));
                map.remove(c);
            }
        }
        for(char ch : map.keySet()) {
            int count = map.get(ch);
            ans.append((ch+"").repeat(count));
        }
        return ans.toString();
    }
}