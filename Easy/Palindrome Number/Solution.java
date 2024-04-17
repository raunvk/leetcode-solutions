class Solution {
    public boolean isPalindrome(int x) 
    {
        if(x<0)
        {
            return false;
        }
        else
        {
            int copy = x;
            int sum = 0;
            while(copy>0)
            {
                int rem = copy%10;
                sum = sum*10 + rem;
                copy /= 10;
            }
            if(sum==x)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
