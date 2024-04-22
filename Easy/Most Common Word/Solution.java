class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        List<String> bannedWords = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String s : banned) {
            bannedWords.add(s);
        }
        String[] words = paragraph.toLowerCase().split("\\W+");
        for(String s : words) {
            if(!bannedWords.contains(s)) {
                map.put(s, map.getOrDefault(s, 0)+1);
            }
        }
        int max = 0;
        String result = "";
        System.out.println(map);
        for(String s : map.keySet()) {
            if(map.get(s)>max) {
                max = map.get(s);
                result = s;
            }
        }
        return result;
    }
}