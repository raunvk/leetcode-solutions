class Solution {
    public int findPermutationDifference(String s, String t) {
        int result = 0;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            map1.put(s.charAt(i), i);
        }
        for(int i=0; i<t.length(); i++) {
            map2.put(t.charAt(i), i);
        }
        for(Map.Entry<Character, Integer> e : map1.entrySet()) {
            Integer val1 = e.getValue();
            Integer val2 = map2.get(e.getKey());
            result += Math.abs(val1 - val2);
        }
        return result;
    }
}