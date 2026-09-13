class Solution {
    public int arrangeCoins(int n) {
        long m = n;
        return ((int)Math.sqrt(1+8*m)-1)/2;
    }
}