class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = null;
        List<Integer> previous = null;
        for(int i=0; i<=rowIndex; i++) {
            current = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if(j==0 || j==i) 
                    current.add(1);
                else 
                    current.add(previous.get(j-1) + previous.get(j));
            }
            result.add(current);
            previous = current;
        }
        List<Integer> result0 = result.get(rowIndex);
        return result0;
    }
}