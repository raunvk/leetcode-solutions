class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder temp = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c!=' ') {
                temp.append(c);
            }
            else {
                if(temp.length()>0) {
                    stack.push(temp.toString());
                    temp = new StringBuilder();
                }
            }
        }
        if(temp.length()>0) {
            stack.push(temp.toString());
        }
        StringBuilder result = new StringBuilder();
        Iterator<String> i = stack.iterator();
        while(i.hasNext()) {
            result.append(stack.pop());
            result.append(" ");
        }
        return result.toString().stripTrailing();
    }
}