class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for(String s : words){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String word = new String(arr);
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        int count = 0;
        for(Integer value : map.values()){
            if(value%2==0){
               count++; 
            }
        }
        return count;
    }
}