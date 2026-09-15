class Solution {
    public int singleNonDuplicate(int[] arr) {
       int low = 0, high = arr.length-1;
       if(arr.length == 1) return arr[0];
       if(arr[0] != arr[1]) return arr[0];
       if(arr[arr.length-1] != arr[arr.length-2]) return arr[arr.length-1];
       while(low <= high){
        int mid = low+(high-low) /2;
        if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
            return arr[mid];
        }
        int first = mid, sec = mid;
        if(arr[mid] == arr[mid-1]){
            sec = mid;
            first = mid-1;
        }
        else{
            first = mid;
            sec = mid+1;
        }
        int leftCount = first+low;
        int rightCount = high-mid;
        if(leftCount%2!=0){
            high = first-1;
        }
        else{
          low = sec+1;
        }
       } 
       return 888;
    }
}