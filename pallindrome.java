class Solution {
    public boolean isPalindrome(int x)
    {
      int sum= 0, rem;
        int n = x;
            while(n>0)
            {
                rem = n%10;
                sum= (sum*10) + rem;
                n=n/10;
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
