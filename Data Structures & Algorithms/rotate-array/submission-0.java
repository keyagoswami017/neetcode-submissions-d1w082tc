class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       if( n == 0)
            return;
       k = k % n ;
       // Revers K elements
       for(int i = n - k, j = n - 1; i < j ; i++,j--){
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
       }

       // Revers n-k elements
       for(int i = 0, j = n-k-1; i<j ; i++, j--){
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
       }

       //Reverse entire
       for(int i = 0, j = n-1; i<j ; i++, j--){
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
       }
            
    }
}