class Solution {
    public int partitionString(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()) {
            if(set.contains(c)) {
                count++;
                set.clear();
            }
            set.add(c);
        }
        return ++count;
    }
}