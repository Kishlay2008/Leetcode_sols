class Solution {
    public boolean digitCount(String num) {
        int[] freq = new int[10];
        for(int i = 0; i < num.length(); i++){
            int digit = num.charAt(i) - '0';
            freq[digit]++;
        }
        for(int i = 0; i < num.length(); i++){
            int x = num.charAt(i)-'0';
            if(freq[i] != x) return false;
        }
        return true;
    }
}