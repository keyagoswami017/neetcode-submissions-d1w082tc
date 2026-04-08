class Solution {
    public int firstMissingPositive(int[] nums) {
        int res = 1;
        Set<Integer> count = new HashSet<>();
        for(int n : nums)
            count.add(n);
        for(int i = 0 ; i < nums.length ; i++){
             if(!count.contains(res))
                 break;
             else
                res++;
            
        }
        return res;
    
    }
}