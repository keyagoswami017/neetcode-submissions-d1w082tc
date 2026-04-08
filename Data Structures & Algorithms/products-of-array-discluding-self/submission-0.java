class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int n = 0, value = 1;
        while( n < nums.length){
            for(int i = 0 ;i < nums.length ;i++)
            {
                if(i != n)
                  value = value * nums[i];
            }
            output[n++] = value; 
            value = 1;    
        }
        return output;
    }
}  
