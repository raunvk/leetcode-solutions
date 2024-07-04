class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> index = Arrays.asList("0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
        List<String> result = new ArrayList<>();
        result.add("");
        int x = 0, y = 1;
        for (int i=0; i<digits.length(); i++) {
            String list = index.get(digits.charAt(i) - '0');
            y = result.size();
            for (int j=0; j<list.length(); j++) {
                for (int k=x; k<y; k++) {
                    result.add(result.get(k) + list.charAt(j));
                }
            }
            x = y;
        }
        return result.subList(y, result.size());
    }
}