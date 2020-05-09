class Solution {
    public int squaresum(int x){
        int sum = 0;
        
        while( x !=0 ){
            int rem = x % 10;
            sum += rem * rem ;
            x = x / 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        while( true ){
            n=squaresum(n);
            if ( n == 1 || n == 7 ) return true;
            if (n < 10 ) return false;
        }
        
    }
}