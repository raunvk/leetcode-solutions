class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) 
            return true;
        int count = 0;
        for(int i=0; i<flowerbed.length; i++) {
            if(flowerbed[i]==0) {
                boolean emptyLeft = (i==0) || (flowerbed[i-1]==0);
                boolean emptyRight = (i==flowerbed.length-1) || (flowerbed[i+1]==0);
                if(emptyLeft && emptyRight) {
                    flowerbed[i]=1;
                    n--;
                    if(n==0)
                        return true;
                    i++;
                }
            }
        }
        return n==0;
    }
}