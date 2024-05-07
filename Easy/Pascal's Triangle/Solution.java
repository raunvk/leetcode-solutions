class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = null;
        List<Integer> previous = null;
        for(int i=0; i<numRows; i++){
            current = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) current.add(1);
                else current.add(previous.get(j-1) + previous.get(j));
            }
                result.add(current);
                previous = current;
        }
        return result;
    }
}