class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        int index = 0;
        for(String word : words){
            boolean flag = word.contains(String.valueOf(x));
            if(flag){
                result.add(index);
            }
            index++;
        }
        return result;
    }
}