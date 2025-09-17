class Solution {
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        for(char c : address.toCharArray()) {
            if(c != '.') {
                result.append(String.valueOf(c));
            }
            else {
                result.append("[.]");
            }
        }
        return result.toString();
    }
}