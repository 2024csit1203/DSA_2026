// Indexes of Subarray Sum
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
