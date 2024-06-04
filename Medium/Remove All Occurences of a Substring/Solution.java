class Solution {
      public String removeOccurrences(String s, String part) {
        while(true) {       
            int index = s.indexOf(part);
            // part not present in s
            if(index == -1) { 
                    break;
            }
            String front = s.substring(0, index);
            String back = s.substring(index + part.length(), s.length());
            String newStr = front + back;
            s = newStr;  
        }
        return s;
    }
}