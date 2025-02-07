class Solution {
    public int mySqrt(int x) {
        int i=2;
        if(x==0) return 0;
        while(i<=x/i)
        {
            if((long)x/i==i){  
                return i;
            }
               i++;
        }
        return i-1;
    }
}
