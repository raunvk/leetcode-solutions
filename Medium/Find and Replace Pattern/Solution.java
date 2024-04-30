class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for(String word : words){
            int flag = 1;
            char[] wordToPat = new char[26];
            char[] patToWord = new char[26];
            for(int i=0; i<word.length(); i++){
                char c1 = word.charAt(i);
                char c2 = pattern.charAt(i);
                if(wordToPat[c1-'a'] == 0) {
                    wordToPat[c1-'a'] = c2;
                }
                if(patToWord[c2-'a'] == 0) {
                    patToWord[c2-'a'] = c1;
                }
                if(wordToPat[c1-'a'] != c2 || patToWord[c2-'a'] != c1){
                    flag = 0;
                }
            }
            if(flag==1) {
                result.add(word);
            }   
        }
        return result;
    }
}
