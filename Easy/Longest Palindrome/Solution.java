class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        int max_one = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> e : map.entrySet()) {
            if(e.getValue()==1) {
                if (max_one==0) {
                    count++;
                    max_one++;
                }
            }
            else if(e.getValue()%2 == 0) {
                count+= e.getValue();
            }
            else if(e.getValue()%2!=0) {
                count+= e.getValue()-1;
                if (max_one==0) {
                    count++;
                    max_one++;
                }
            }
        }
        return count;
    }
}