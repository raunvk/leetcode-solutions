class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();

        for(String word : words) {
            String code = "";
            for(char ch : word.toLowerCase().toCharArray()) {
                int index = ch-97;
                code += morse[index];
            }
            set.add(code);
        }
        return set.size();
    }
}