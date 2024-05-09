class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    int n = triangle.size();
    // front[] is to store previous value
    int front[] = new int[n];
    for(int j=0; j<n; j++) {
        front[j] = triangle.get(n-1).get(j);
    }
    // filled the last row (i = N-1)
    // start from 'N-2' and move upwards to find the values correctly
    for(int i=n-2; i>=0; i--) {
        int cur[] = new int[n];
        for(int j=i; j>=0; j--) {
            int down = triangle.get(i).get(j) + front[j];
            int diagonal = triangle.get(i).get(j) + front[j+1]; 
            cur[j] = Math.min(down, diagonal);
        }
        front = cur;
    }
    return front[0];  
    }
}