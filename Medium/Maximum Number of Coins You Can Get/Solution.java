class Solution {
    public int maxCoins(int[] piles) {
        int sum = 0;
        int j = 0;
        int i = piles.length-2;
        Arrays.sort(piles);
        while(j < piles.length/3){
            sum += piles[i];
            i -= 2;
            j++;
        }
        return sum;
    }
}