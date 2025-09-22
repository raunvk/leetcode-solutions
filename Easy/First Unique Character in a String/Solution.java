class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> frequency = new LinkedHashMap<>();
        for(char c : s.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        /*for(int i=0; i<s.length(); i++) {
            if(frequency.get(s.charAt(i))==1) {
                return i;
            }
        }*/
        for(Map.Entry<Character, Integer> e : frequency.entrySet()) {
            if(e.getValue()==1) {
                for(int i=0; i<s.length(); i++) {
                    if(s.charAt(i) == e.getKey().charValue()) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}