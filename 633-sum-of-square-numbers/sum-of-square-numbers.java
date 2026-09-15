class Solution { 
    public boolean judgeSquareSum(int c) {
        long low = 0;
        long high = (long) Math.sqrt(c);
        while(low <= high){
            long val = (low*low) + (high*high);
            if(val==c) return true;
            else if(val > c) high--;
            else low++;
        }
        return false;
    }
}