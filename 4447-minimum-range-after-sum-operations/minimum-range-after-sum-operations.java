class Solution {
    public int minRange(int a, int b, int c) {
        int[] l = {a,b,c};
        Arrays.sort(l);
       int k = l[2] - l[0];
        int m = l[1];
        return Math.min(k,m);
    }
}