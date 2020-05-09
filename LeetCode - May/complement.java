class Solution {
    public int findComplement(int num) {
        int bit = 0;
        int remain = num;
        
        while ( remain != 0 ){
            bit = bit << 1;
            bit = bit ^ 1;
            remain = remain >>1;
        }
        
        return bit ^ num;
        
    }
}