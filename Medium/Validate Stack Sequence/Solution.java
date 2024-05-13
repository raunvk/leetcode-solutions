class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int k=0,j=0;
        for(int x : pushed) {
            pushed[k++] = x;   
            while(k!=0 && popped[j]==pushed[k-1]) {
                j++;
                k--;
            }  
        }
        return k==0;   
    }
}