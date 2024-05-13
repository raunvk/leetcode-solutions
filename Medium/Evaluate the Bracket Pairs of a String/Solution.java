class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for(List<String> list : knowledge) {
            map.put(list.get(0), list.get(1));
        }
        StringBuilder result = new StringBuilder();
        char[] arr = s.toCharArray();
        int flag = 0;
        StringBuilder word = new StringBuilder();
        for(char ch : arr) {
            if(ch=='(') {
                flag = 1;
                continue;
            }
            if(ch==')') {
                flag = 0;
                if(map.containsKey(word.toString())) {
                    result.append(map.get(word.toString()));
                }
                else {
                    result.append("?");
                }
                word = new StringBuilder();
                continue;
            }
            if(flag == 1) {
                word.append(String.valueOf(ch));
            }
            if(flag==0) {
                result.append(String.valueOf(ch));
            }
        }
        return result.toString();
    }
}