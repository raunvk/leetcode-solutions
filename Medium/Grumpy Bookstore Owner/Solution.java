class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = grumpy.length;
        int i=0, current = 0, max = 0;
        for(int j=0; j<grumpy.length; j++) {
            current += customers[j] * grumpy[j];
            max = Math.max(current, max);
            if(j>=minutes-1) {
                current -= customers[i]*grumpy[i++];
            }
        }
        int result = max;
        for(i=0; i<grumpy.length; i++) {
            result += customers[i]*(1-grumpy[i]);
        }
        return result;
    }
}