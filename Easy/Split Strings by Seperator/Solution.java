class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for(String str : words){
            String[] arr = str.split("\\Q" + separator + "\\E");
            for(String s : arr){
                if(!s.isEmpty())
                    result.add(s);
            }
        }
        return result;
    }
}