class Solution {
    public int reverse(int x) {
        int neglimit = -2147483648;
        int poslimit  = 2147483647;
        long rev = 0;
        while(x!=0) {
            int rem = x%10;
            rev = rev*10 + rem;
            x /= 10;
        }
        if (rev > poslimit || rev < neglimit) {
            return 0;
        }
        else {
            return (int)rev;
        }
    }
}