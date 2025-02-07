class Solution {
    public boolean isPalindrome(int x) {
        int r=0,t;
        t=x;
        while(t>0){
            r=r*10;
            r=r+(t%10);
            t/=10;
        }
        return r==x;
        
    }
}
