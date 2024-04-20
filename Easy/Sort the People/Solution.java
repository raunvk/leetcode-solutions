class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] result = new String[n];
        Map<Integer, String> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for(int i=0; i<n; i++){
            result[n-1-i] = map.get(heights[i]);
        }
        return result;
    }
}