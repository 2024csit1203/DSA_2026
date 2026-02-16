// 004-> Indexes of Subarray Sum
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int left = 0;
        int sum = 0;
        
        for(int right = 0; right < arr.length; right++){
            sum += arr[right];
            
            while(sum > target && left <= right){
                sum -= arr[left];
                left++;
            }
            
            if(sum == target){
              list.add(left + 1);
              list.add(right + 1);
              return list;
          }
        }
        
        list.add(-1);
        
        return list;
        
        
    }
}

// 005->  Kadane's Algorithm
class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int currSum = arr[0];
        int maxSum  = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum  = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
