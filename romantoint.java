class Solution {
    public int romanToInt(String s) {
        int x=0,add=0,a=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch=='I')
            {
                add=1;
            }
            else if(ch=='V')
            {
                add=5;
            }else if(ch=='X')
            {
                add=10;
            }else if(ch=='L')
            {
                add=50;
            }else if(ch=='C')
            {
                add=100;
            }else if(ch=='D')
            {
                add=500;
            }else if(ch=='M')
            {
                add=1000;
            }
        
        if(add<a)
        {
            x-=add;
        }
        else{
            x+=add;
        }
        a=add;
        }
        return x;
}
    }    
