class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list =new ArrayList();
        for(String str : queries) {
            list.add(bool(str,pattern));
        }
        return list;
    }
    // check occurance of char in string str with pattern and increment count
    // if count is equal to the pattern return true
    Boolean bool(String str, String pattern) {
        int i=0;
        for(char c: str.toCharArray()) {
            if(i<pattern.length() && c==pattern.charAt(i)) {
                i++;
            }    
            // checking rest of string if there is uppercase character
            else if(c < 'a'){
                return false;
            }
        }
        return (i==pattern.length());
    }
}