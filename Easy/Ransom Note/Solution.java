class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> m_frequency = new HashMap<>();
        for(char c : magazine.toCharArray()) {
            m_frequency.put(c, m_frequency.getOrDefault(c,0) + 1);
        }
        for(char c : ransomNote.toCharArray()) {
            if(m_frequency.containsKey(c)) {
                if(m_frequency.get(c) >= 1) {
                    m_frequency.put(c, m_frequency.get(c)-1);
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return true;
    }
}