class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();
        for(char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }
        int counter = 0;
        System.out.println(allowedSet);
        for(String word : words) {
            int flag = 1;
            for(char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    flag = 0;
                    break;
                }
            }
            if(flag==1) {
                counter++;
            }
        }
        return counter;
    }
}