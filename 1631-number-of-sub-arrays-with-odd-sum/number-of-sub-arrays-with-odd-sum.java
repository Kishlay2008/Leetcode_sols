class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        long oddCount=0;
        long sum=0;
        for(int i=0;i<n;i++)
            {
                sum+=arr[i];
                oddCount += sum%2;
            }
        oddCount += (n-oddCount)*oddCount;
        return (int)(oddCount%1000000007);
    }
}