class Solution {
    public int longestMonotonicSubarray(int[] arr) {
       int max = 1, incr = 1, decr = 1;
       for (int i = 1; i < arr.length; i++) {
          if (arr[i] > arr[i - 1]) {
                incr++;
                decr = 1;
        } else if (arr[i] < arr[i - 1]) {
              decr++;
              incr = 1;
        } else {
             incr = decr = 1;
        }
      max = Math.max(max, Math.max(incr, decr));
    }
   return max;
    }
}