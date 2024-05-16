class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] strings = sentence.split(" ");
        for(int i=0; i<strings.length; i++) {
            for(int j=0; j<dictionary.size();j++){
                if(strings[i].startsWith(dictionary.get(j))){
                    strings[i] = dictionary.get(j);
                }
            }
        }
        String result = String.join(" ",strings);
        return result;
    }
}