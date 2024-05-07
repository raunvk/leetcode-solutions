class Solution {
    public boolean isUgly(int n) {
        if(n<1) return false;
        //keep dividing by 2 till it can be
        while(n%2==0) n/=2;
        //keep dividing by 3 till it can be
        while(n%3==0) n/=3;
        //keep dividing by 5 till it can be
        while(n%5==0) n/=5;
        //is the n completely divided (reduced to 1)?
        return n==1;
    }
}