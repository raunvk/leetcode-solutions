class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs.length==0) {
            return result;
        }
        String[] arr = new String[strs.length];
        int index = 0;
        for(String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String newStr = new String(charArray);
            arr[index] = newStr;
            index++;
        }
        Map<String, List<String>> map = new HashMap<>();
        index = 0;
        for(String s : arr) {
            if(!map.containsKey(s)) {
                List<String> list = new ArrayList<>();
                list.add(strs[index]);
                map.put(s, list);
            }
            else {
                List<String> list = map.get(s);
                list.add(strs[index]);
                map.put(s, list);
            }
            index++;
        }
        for(Map.Entry<String, List<String>> e : map.entrySet()) {
            List<String> list = e.getValue();
            result.add(list);
        }
        return result;
    }
}