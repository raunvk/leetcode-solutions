class Solution {
    public String reverseVowels(String s) {
        List<Character> charList = new ArrayList<>();
        for(char c : s.toCharArray())
            if(isVowel(c)) {
                charList.add(c);
        }
        int index = 0;
        StringBuilder result = new StringBuilder();
        System.out.println(charList);
        for(char c : s.toCharArray()) {
            if(isVowel(c))
                result.append(charList.get(charList.size()-1-index++));
            else
                result.append(c);
        }
        return result.toString();
    }
    private boolean isVowel(char c) {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return true;
        return false;
    }
}