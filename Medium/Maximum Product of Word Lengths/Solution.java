class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        List<Set<Character>> list = new ArrayList<>(n);
        int max = 0;
        for(String word : words) {	
            Set<Character> set = new HashSet();
            list.add(set);
            for(int i=0; i<word.length(); i++) {
                set.add(word.charAt(i));
            }
        }
        for(int i=0; i<n; i++) {
            Set<Character> set1 = list.get(i);
            for(int j=i+1; j<n; j++) {
                boolean hasCommon = false;
                Set<Character> set2 = list.get(j);
                for(Character c : set1) {
                    if(set2.contains(c)) {
                        hasCommon = true;
                        break;
                    }
                }
                if(!hasCommon) {
                    max = Math.max(max, words[i].length()*words[j].length());	
                } 
            }
        }
        return max;
    }
}