class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder newStr = new StringBuilder();
        int i, index = 0;
        for(i=0; i<s.length(); i++) {
            if(i==spaces[index]) {
                newStr.append(" ");
                newStr.append(String.valueOf(s.charAt(i)));
                index++;
                if(index>=spaces.length) {
                    break;
                }
            }
            else {
                newStr.append(String.valueOf(s.charAt(i)));
            }
        }
        return newStr.append(s.substring(i+1, s.length())).toString();
    }
}